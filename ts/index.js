//types - number, string, boolean, void, [], any
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
//ex1: function with types
function greet(name, age) {
    console.log(`Name=${name}, typeof(name)=${typeof (name)}`);
    console.log(`Age=${age}, typeof(age)=${typeof (age)}`);
}
console.log('greet() fn call ');
greet("Kishor", 38);
//ex2: declaring variables of different types
let username = "Kishor";
let phone = 993939;
let skills = ["Java", "JS", "DevOps"];
let isRetired = false;
console.log(`Printing all variables -> Username=${username}, Phone=${phone}, Skills=${skills}, IsRetired=${isRetired}`);
// ex3: creating object with types, Note: you use : after the variable
let user;
user = { id: 100, name: "Kishor" }; // try assigning another property it doesn't work
console.log(`printing object properties -> Id=${user.id}, Name=${user.name}`);
// Ex4 : optional properties
let customer;
customer = { firstname: "Kishor" };
// Ex5 : Union types - you can call common methods if they are present in both types
let items;
items = [10, 20, 30, 40, 50, 60];
console.log(`Union types using slice for numbers: ${items.slice(1, 3)}`);
items = "welcome to ts";
console.log(`Union types using slice for numbers: ${items.slice(1, 3)}`);
// Ex6: read-only variables - must appear as a property declaration or index signature
class Company {
    constructor(id, empCount) {
        this.gst = "ABC9239";
        this.id = id;
        this.empCount = empCount;
    }
    // getter methods 
    getId() {
        return this.id;
    }
    setEmpCount(empCount) {
        this.empCount = empCount;
    }
}
let company = new Company('ABC', 35);
console.log(`Printing readonly properties -> Id=${company.getId()}, Gst=${company.empCount}`);
// Ex7: overloaded methods and constructors - you can't achieve but you can simulate
class Person {
    constructor(name, email) {
        this.name = name;
        this.email = email;
    }
}
function printCoordinates(point) {
    console.log(`print co-ordinates, x = ${point.x}, y = ${point.y}`);
}
printCoordinates({ x: 20, y: 30 });
let p = { name: "Kishor", age: 35 };
console.log(`Interfaces declared twice with same name: ${p.name}, ${p.age}`);
// Ex 10: tuples
let colors;
colors = ["red", "green", "blue"]; // fixed to 3 values
console.log(`Tuples are fixed values: ${colors}`);
let intersect;
intersect = { name: "Kishor", email: "k@g" };
console.log(`Intersection type combines multiple types: ${intersect.name}`);
//Ex12: Generics - reusable & capable to work with future types created today and even tomorrow
function identity(arg) {
    return arg;
}
let num = identity(20);
console.log(`Generics Number = ${num}`);
let str = identity("hello");
console.log(`Generics String = ${str}`);
let loggedIn = identity(true);
console.log(`Generics Boolean = ${loggedIn}`);
//Ex13: Short-cut syntax of constructors
class Employee {
    constructor(_id, _name) {
        this._id = _id;
        this._name = _name;
    }
    display() {
        console.log(`Short cut syntax used, Name=${this._name}, Id=${this._id}`);
    }
}
let employee = new Employee(123, "Kishor");
employee.display();
// Ex14: function with promises
// Ex15: Decorators
// Ex16: Conditional types
// Ex17: Mapped types
// Decorator
function Logger(constructor) {
    console.log("Class created:", constructor.name);
}
// Apply the decorator to a class
let Person2 = class Person2 {
    constructor(name) {
        this.name = name;
    }
};
Person2 = __decorate([
    Logger
], Person2);
//   const p2 = new Person2("Alice");
//   const p3 = new Person2("Alice2");
// Output: Class created: Person
