function sumNums(...numbers) {
    return numbers.reduce((total, num) => total + num, 0);
}

console.log(sumNums(1, 5, 7));        
console.log(sumNums(10, 15, 20, 40)); 
