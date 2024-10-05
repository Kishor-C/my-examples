import { useSelector } from "react-redux"
import { FirstComponent } from "./FirstComponent";


function App() {
 let username = useSelector(state=>state.username.value);
  return (
    <div>
      <h1>App Component</h1>
      <h3>Hello {username}</h3>
      <FirstComponent />
    </div>
  )
}

export default App
