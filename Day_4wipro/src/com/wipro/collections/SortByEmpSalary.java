
package com.wipro.collections;

import java.util.Comparator;

public class SortByEmpSalary implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
    	
    	Double d1=Double.valueOf(e1.getEmpSalary());
		Double d2=Double.valueOf(e2.getEmpSalary());
        return d1.compareTo(d2);  // ascending
    }
}
