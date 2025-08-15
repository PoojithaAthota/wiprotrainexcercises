function printEmployees(employees) {
    employees.forEach(function (emp) {
        console.log("ID: ".concat(emp.empId, ", Name: ").concat(emp.empName, ", Salary: ").concat(emp.salary));
    });
    return employees.length;
}
var empList = [
    { empId: 101, empName: "Pooji", salary: 50000 },
    { empId: 102, empName: "Ashok", salary: 60000 },
    { empId: 103, empName: "Bhanu", salary: 55000 }
];
var count = printEmployees(empList);
console.log("Total Employees: ".concat(count));
