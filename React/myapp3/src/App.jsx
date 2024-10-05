import { createContext, useContext, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Component1 } from './components/Component1'

export const NameContext = createContext();


function App() {
  
  let [username, setUsername] = useState('');
  let [counter, setCounter]=useState(2);
  return (
    <div>
     <NameContext.Provider value={username}>
        <Component1 />
     </NameContext.Provider>
      <button onClick={()=>{
        setCounter(counter+1);
        setUsername('Kishor: '+counter);
      }}>Add Counter</button>
    </div>
  )
}

export default App
