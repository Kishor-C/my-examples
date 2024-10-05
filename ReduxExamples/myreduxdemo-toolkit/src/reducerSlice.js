import { createSlice } from "@reduxjs/toolkit";

// you write initial state & reducer functions inside the createSlice
// object without any action.type
const nameSlice = createSlice({
    name: "username",
    initialState : {
        value : "Guest",
    },
    reducers : {
        addName(state, action) {
            console.log(action);
            state.value = action.payload;
        }
    }
});

export const {addName} = nameSlice.actions; // export the actions
export default nameSlice.reducer; // export the reducer 
