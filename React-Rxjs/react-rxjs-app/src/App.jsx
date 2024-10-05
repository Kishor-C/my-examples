
import './App.css'
import { createSignal } from "@react-rxjs/utils"
import { map } from "rxjs/operators"
import { bind, Subscribe } from "@react-rxjs/core"

// A signal is an entry point to react-rxjs. It's equivalent to using a subject
const [textChange$, setText] = createSignal();

const [useText, text$] = bind(textChange$, "")
// Previously...
// const [useText, text$] = bind(...);

const [useCharCount, charCount$] = bind(
  text$.pipe(
    map((text) => text.length)
  )
)

function CharacterCount() {
  const count = useCharCount()

  return <>Character Count: {count}</>
}



function TextInput() {
  const text = useText()
  
  return (
    <div>
      <input
        type="text"
        value={text}
        placeholder="Type something..."
        onChange={(e) => setText(e.target.value)}
      />
      <br />
      Echo: {text}
    </div>
  )
}
function CharacterCounter() {
  return (
    <div>
      <Subscribe>
        <TextInput />
        <CharacterCount />
      </Subscribe>
    </div>
  )
}
function App() {
  
  return (
    <div>
      <h1>App Component</h1>
      <CharacterCounter />
    </div>
  )
}

export default App
