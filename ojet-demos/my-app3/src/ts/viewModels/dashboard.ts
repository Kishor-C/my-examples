/**
 * @license
 * Copyright (c) 2014, 2024, Oracle and/or its affiliates.
 * Licensed under The Universal Permissive License (UPL), Version 1.0
 * as shown at https://oss.oracle.com/licenses/upl/
 * @ignore
 */
  import * as ko from "knockout";
  import * as Bootstrap from "ojs/ojbootstrap";
  import "oj-c/input-text";
  import "oj-c/button";
  import 'oj-c/input-password';
  import "ojs/ojknockout";

  import rootViewModel from "../appController";
class DashboardViewModel {

   firstname: ko.Observable<string>;
   password: ko.Observable<string>;
   isDisabled : ko.Observable<boolean>;
    constructor() {
      this.firstname = ko.observable("");
      this.password = ko.observable("");
      this.isDisabled = ko.observable(true);
    }
    navigateToSuccess = (event:Event) => {
      rootViewModel.router?.go({path:'incidents'})
    }
    public buttonAction = (event: Event) => {
      const target = event.target as HTMLInputElement;
      console.log(target.value);
      if(this.firstname().length > 3 && this.password().length > 2) {
        this.isDisabled(false);
      } else {
        this.isDisabled(true);
      }
    };
    
}

export = DashboardViewModel;
