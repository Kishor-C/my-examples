import { useSelector } from "react-redux";

export function FirstComponent() {
    let name = useSelector(state => state.name);

    return (<div>
        <h2>First Component {name}</h2>
    </div>)
}