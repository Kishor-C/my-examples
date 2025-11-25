export const USERS = [
    {userId : 100, name : "Atharv", dob : "2024-04-08"},
    {userId : 200, name : "Siddharth", dob : "2019-03-26"},
    {userId : 300, name : "Ravi", dob : "1987-03-18"},
    {userId : 400, name : "Lakshmi", dob : "1970-06-01"},
];

export interface User {
    userId : number; 
    name : string;
    dob : string;
}