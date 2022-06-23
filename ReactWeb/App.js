import "./styles.css";
import {useState} from "react";

export default function App(){
    const [todo, setTodo] = useState();
    const handleChange = (event) => {
        setTodo(event.target.value);
    };
    return (
        <div className = "App">
            <h1>ToDO List</h1>
            <div>
                <input placeHolder = "add todo here..." onChange = {
                    handleChange
                }/>
                <button>Add</button>
                <p>{todo}</p>
            </div>
        </div>
    )
}