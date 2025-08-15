class Vehicle {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  getInfo() {
    return `${this.year} ${this.make} ${this.model}`;
  }
}


class Car extends Vehicle {
  constructor(make, model, year, numDoors) {
    super(make, model, year);
    this.numDoors = numDoors;
  }

  getInfo() {
    return `${super.getInfo()} - ${this.numDoors} doors`;
  }
}

const car1 = new Car("Toyota", "Camry", 2022, 4);
const car2 = new Car("Honda", "Civic", 2023, 2);

console.log(car1.getInfo()); 
console.log(car2.getInfo()); 
