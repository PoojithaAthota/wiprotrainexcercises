let updatedPersons = [
    { name: "Poojitha", age: 17, city: "Hyderabad" },
    { name: "Ashok", age: 25, city: "Mumbai" },
    { name: "Bhanu", age: 16, city: "Delhi" },
    { name: "Abhay", age: 32, city: "Bangalore" },
    { name: "Sahasra", age: 18, city: "Chennai" }
];

//for (let i = 0; i < updatedPersons.length; i++) {
//    if (updatedPersons[i].age >= 18) {
//        updatedPersons[i].status = "Adult";
//    } else {
//        updatedPersons[i].status = "Minor";
//    }
//}
updatedPersons.map(p => p.status = p.age >= 18 ? "Adult" : "Minor");

console.log(updatedPersons);
