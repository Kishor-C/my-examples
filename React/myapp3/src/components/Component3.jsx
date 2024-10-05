import { createContext, useContext } from "react"
import { NameContext } from "../App"


export function Component3() {
   
    let nameCounter = useContext(NameContext);
    return (<div>
        <h2>Component3 {nameCounter}</h2>
    </div>)
}