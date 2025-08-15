interface Employee {
    empId: number;
    empName: string;
    salary: number;
}

function printEmployees(employees: Employee[]): number {
    employees.forEach(emp => {
        console.log(`ID: ${emp.empId}, Name: ${emp.empName}, Salary: ${emp.salary}`);
    });
    return employees.length;
}

const empList: Employee[] = [
    { empId: 101, empName: "Pooji", salary: 50000 },
    { empId: 102, empName: "Ashok", salary: 60000 },
    { empId: 103, empName: "Bhanu", salary: 55000 }
];

const count = printEmployees(empList);
console.log(`Total Employees: ${count}`);
