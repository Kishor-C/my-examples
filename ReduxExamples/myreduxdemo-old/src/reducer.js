
let initialState = {
    name : 'Guest',
    user : {id: 1234, name : 'Guest', phone : 9999999}
}

export function reducer(state=initialState, action) {
    console.log('_________ reducer __________');
    console.log(action);
    if(action.type == 'ADD_NAME') {
        return {...state, "name": action.payload};
    }
    if(action.type == 'ADD_USER') {
        return {...state, "user": action.payload};
    }
    return state;
}