
export class Employee {
    constructor(id, name) {
        this.id = id;
        this.name = name;
    }
    display() {
        console.log(`id=${this.id}, name=${this.name}`)
    }
}