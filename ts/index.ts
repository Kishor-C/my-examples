//types - number, string, boolean, void, [], any

//ex1: function with types
function greet(name : string, age : number) : void {
    console.log(`Name=${name}, typeof(name)=${typeof(name)}`);
    console.log(`Age=${age}, typeof(age)=${typeof(age)}`)
}
console.log('greet() fn call ')
greet("Kishor", 38); 

//ex2: declaring variables of different types
let username : string = "Kishor";
let phone : number = 993939;
let skills : string[] = ["Java", "JS", "DevOps"]
let isRetired : boolean = false;
console.log(`Printing all variables -> Username=${username}, Phone=${phone}, Skills=${skills}, IsRetired=${isRetired}`)

// ex3: creating object with types, Note: you use : after the variable
let user : {id : number, name : string};
user = {id : 100, name : "Kishor"} // try assigning another property it doesn't work
console.log(`printing object properties -> Id=${user.id}, Name=${user.name}`)

// Ex4 : optional properties
let customer : {firstname : string, lastname?:string};
customer = {firstname : "Kishor"};


// Ex5 : Union types - you can call common methods if they are present in both types


let items : string | number[];
items = [10, 20, 30, 40, 50, 60];
console.log(`Union types using slice for numbers: ${items.slice(1, 3)}`);
items = "welcome to ts"
console.log(`Union types using slice for numbers: ${items.slice(1, 3)}`);


// Ex6: read-only variables - must appear as a property declaration or index signature
class Company { 
    private readonly id : string ; // either initialize here or inside constructor
    private readonly gst : string = "ABC9239";
    public empCount : number;
    constructor(id : string, empCount : number) {
        this.id = id;
        this.empCount = empCount;
    }
    // getter methods 
    getId() : string {
        return this.id;
    }
    setEmpCount(empCount : number) : void {
        this.empCount = empCount;
    }
    
}
let company : Company = new Company('ABC', 35);
console.log(`Printing readonly properties -> Id=${company.getId()}, Gst=${company.empCount}`);



// Ex7: overloaded methods and constructors - you can't achieve but you can simulate
class Person {
    name : string;
    email ?: string;
    constructor(name : string);
    constructor(name : string, email : string);
    constructor(name : string, email? : string) { 
        this.name = name;
        this.email = email;
    }
}

// Ex 8: types - better |conditional|mapped||tuples|unions
type Point  = { x: number, y : number }
function printCoordinates(point : Point) {
    console.log(`print co-ordinates, x = ${point.x}, y = ${point.y}`)
}
printCoordinates({x:20, y:30});

// Ex 9: interfaces - better for reusing & extending
interface Person {
    name : string;
}
interface Person {
    age : number;
}
let p : Person = {name : "Kishor", age : 35};
console.log(`Interfaces declared twice with same name: ${p.name}, ${p.age}`);
// Ex 10: tuples
let colors : [string, string, string];
colors = ["red", "green", "blue"]; // fixed to 3 values
console.log(`Tuples are fixed values: ${colors}`);


// Ex11: Intersection types : combines multiple types & creates a new one which must have all the features
interface A { name : string}
interface B { email : string}
let intersect : A & B;
intersect = {name : "Kishor", email : "k@g"};
console.log(`Intersection type combines multiple types: ${intersect.name}`);

//Ex12: Generics - reusable & capable to work with future types created today and even tomorrow
function identity<T>(arg : T) {
    return arg;
}
let num : number = identity<number>(20);
console.log(`Generics Number = ${num}`);
let str : string = identity<string>("hello");
console.log(`Generics String = ${str}`);
let loggedIn : boolean = identity<boolean>(true);
console.log(`Generics Boolean = ${loggedIn}`);

//Ex13: Short-cut syntax of constructors
class Employee { 
    constructor(private _id : number, private _name : string) { } 
    display() : void {
        console.log(`Short cut syntax used, Name=${this._name}, Id=${this._id}`)
    }
}
let employee : Employee = new Employee(123, "Kishor");
employee.display();

// Ex14: function with promises

// Ex15: Decorators

// Ex16: Conditional types

// Ex17: Mapped types

// Ex18: Decorator
function Logger(constructor: Function) {
    console.log("Class created:", constructor.name);
  }
  
  // Apply the decorator to a class
  @Logger
  class Person2 {
    constructor(public name: string) {}
  }
  
//   const p2 = new Person2("Alice");
//   const p3 = new Person2("Alice2");
  // Output: Class created: Person
  