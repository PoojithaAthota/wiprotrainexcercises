package com.wipro.datetimedemo;

import java.util.Comparator;

import com.wipro.collections.Employees1;

public class AgeComparator implements Comparator<Employees1>  {

	@Override
	public int compare(Employees1 e1, Employees1 e2) {
		// TODO Auto-generated method stub
		return Integer.compare(e1.empAge, e2.empAge);
	}

}