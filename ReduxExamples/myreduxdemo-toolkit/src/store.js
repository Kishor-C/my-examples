import { configureStore } from "@reduxjs/toolkit";

import nameSlice from './reducerSlice';

const store = configureStore({reducer : {
    username : nameSlice
}});

export default store;