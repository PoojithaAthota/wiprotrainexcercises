
var persons = [
    { name: "Poojitha", age: 24, city: "New York" },
    { name: "Ashok", age: 27, city: "Los Angeles" },
    { name: "Bhanu", age: 30, city: "London" },
    { name: "Sahasra", age: 16, city: "Hyderabad" },
    { name: "Abhay", age: 10, city: "Bangalore" }
];

var eligibleVoters = persons.filter(function(person) {
    return person.age >= 18;
});

console.log(persons);
console.log(eligibleVoters); 

