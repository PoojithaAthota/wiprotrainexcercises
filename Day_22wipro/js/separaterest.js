function separateFirstRest(first, ...rest) {
    return {
        first: first,
        rest: rest
    };
}

console.log(separateFirstRest(7, 15, 34, 20));


