import { useState } from "react";
import { useDispatch, useSelector } from "react-redux";

export function SecondComponent() {
    let [temp, setTemp] = useState(''); // this is to set the state.name
    let name = useSelector(state => state.name); // reads the state.name
    let user = useSelector(state =>state.user); // reads the state.user
    let dispatch = useDispatch();
    let [id, setId] = useState('');
    let [username, setUsername] = useState(""); 
    let [phone, setPhone] = useState("");

    let handleSubmit = (e) => {
        e.preventDefault();
        let obj = {id: id, name: username, phone: phone};
        dispatch({type: "ADD_USER", payload: obj});
    }

    let changeName = () => {
        dispatch({type:"ADD_NAME", payload: temp});
    }

    return (<div>
        
        <h2>Second Component {name}</h2>
        <input type = 'text' onChange = {(e)=>setTemp(e.target.value)} />
        <button onClick={changeName}>Change Name</button>
        <hr />
        <h2>User Form</h2>
        <form onSubmit={handleSubmit}>
            <input type = 'number' placeholder='Enter id' onChange={e=>setId(e.target.value)} /> <br />
            <input type = 'text' placeholder='Enter name' onChange={e=>setUsername(e.target.value)} /> <br />
            <input type = 'number' placeholder='Enter phone' onChange={e=>setPhone(e.target.value)}  /> <br />
            <input type = 'submit' value = 'store' />
        </form>
        <div>
            <h3>User Information</h3>
            <p>Id: {user.id}, Name: {user.name}, Phone: {user.phone}</p>
        </div>
    </div>)
}