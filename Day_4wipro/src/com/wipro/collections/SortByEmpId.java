package com.wipro.collections;

import java.util.Comparator;

public class SortByEmpId implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.empId.compareTo(e2.empId);  // ascending
    }
}

