import { useState } from "react";
import { createContext } from "react";

let UserContext = createContext(undefined);

export function Component1(props: any) {
    let name = props.name;
    return (<div>Component 1 nests component2 <Component2 name = {name}/></div>)
}

export function Component2(props: any) {
    let name = props.name;
    return (<div>Component 2 nests component3 <Component3 name = {name} /></div>)
}

export function Component3(props: any) {
    let name = props.name;
    return (<div>Component 3 printing name: {name}</div>)
}





export function Hello(props : any) {
    let {name, age} : User = props;
    let [message, setMessage] = useState<string>("");
    let handleClick = () => {
        setMessage("Hello World");
    }
    
    return (<div>
        <Component1 name = "KISHOR"/>
        <h2>Hello {name}, your age is {age}</h2>
        <button onClick = {handleClick}>MyButton</button>
        <div>{message}</div>
    </div>)
}


interface User {
    name : string, 
    age : number
}