/**
 * @license
 * Copyright (c) 2014, 2024, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
import * as AccUtils from "../accUtils";
import * as ko from "knockout";

import "oj-c/input-text";
import "oj-c/input-number";
import "ojs/ojknockout";
import "oj-c/button";
import "ojs/ojtable"
import 'ojs/ojdatetimepicker';

import { RESTDataProvider } from "ojs/ojrestdataprovider";

type D = {id: number, username:string, name:string, email:string, street:string}
type K = D['id'];

class DashboardViewModel {

  readonly keyAttributes = 'id';
  public dataprovider : RESTDataProvider<K,D>;

  firstname : ko.Observable<string>;
  fakeJson : ko.Observable<string>;
  userId : ko.Observable<number> | ko.Observable<any>;
  age : ko.Observable<number>  | ko.Observable<any>;
  constructor() {
    this.firstname = ko.observable("");
    this.fakeJson = ko.observable("");
    this.userId = ko.observable(null);
    this.age = ko.observable(null);
    
    this.dataprovider = new RESTDataProvider({
      keyAttributes : this.keyAttributes,
      url : "https://jsonplaceholder.typicode.com/users",
      transforms: {
        fetchFirst : {
          request : async (options) => {
            const url = new URL(options.url);
            return new Request(url.href)
          },
          response : async ({body}) =>{
            const {data} = body;
            return {data}
          }
        }
      }
    });
  }
  public invokeFakeData = async (event: Event) => { 
    let response = await fetch("https://jsonplaceholder.typicode.com/users");
    let jsonData = await response.json();
    this.dataprovider.mutate({
      add : {
        data : jsonData,
        keys : new Set(jsonData)
      }
    })
    console.log(this.dataprovider);
  }
  public buttonAction = (event: Event) => {
    console.log("You clicked on a button");
    let content : string = (event.currentTarget as HTMLElement).tagName;
    console.log(content);
  }
}

export = DashboardViewModel;
