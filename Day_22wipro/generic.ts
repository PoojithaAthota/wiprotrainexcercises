function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

const result1 = pair<number, string>(10, "Pooji");
console.log(result1); 

const result2 = pair<boolean, number>(true, 50);
console.log(result2); 
