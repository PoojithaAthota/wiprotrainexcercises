let employees = [
    { name: "Poojitha", role: "Developer", empId: 101, salary: 50000 },
    { name: "Ashok", role: "Manager", empId: 102, salary: 90000 },
    { name: "Bhanu", role: "Developer", empId: 103, salary: 70000 },
    { name: "Abhay", role: "Manager", empId: 104, salary: 85000 },
    { name: "Sahasra", role: "Developer", empId: 105, salary: 72000 }
];

let totalManagerSalary = employees
    .filter(emp => emp.role == "Manager")
    .reduce((total,emp) =>total + emp.salary,0);
        
console.log("Total Salary of Managers:", totalManagerSalary);
