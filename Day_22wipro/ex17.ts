class Calculator {
    add(a: number, b: number): number {
        return a + b;
    }

    subtract(a: number, b: number): number {
        return a - b;
    }
}

const calc = new Calculator();
console.log("Add:", calc.add(15, 23));      
console.log("Subtract:", calc.subtract(10, 7)); 
