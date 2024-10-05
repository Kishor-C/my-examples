import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { addName } from "./reducerSlice";


export function FirstComponent() {
    let [temp, setTemp] = useState("");
    let username = useSelector(state=>state.username.value);
    let dispatch = useDispatch();
    
    let handleChange = () => {
        dispatch(addName(temp));
    }

    return (<div>
        <h2>First Component</h2>
        <div>
            Hello {username}
        </div>
        <input type = "text" onChange = {e=>setTemp(e.target.value)} />
        <button onClick = {handleChange}>Change</button>

    </div>)
}