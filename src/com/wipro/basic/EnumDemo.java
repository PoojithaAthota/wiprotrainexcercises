package com.wipro.basic;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String days[] = {"sun","mon","tue"};
		
		String day ="sunday";
		if(day.equalsIgnoreCase(days[0])) {
			System.out.println("Sunday");
		}
		
		enum Day {
			SUN,
			MON,
			TUE,
			WED,
			THU,
			FRI,
			SAT
		}
		
//		Day day=Day.Mon;
//		if(day==Day.Mon)
//		{
//			System.out.println("Monday");
//		}
		
		for(Day d:Day.values())
		{
			System.out.println(d);
		}
		enum Month{
			JAN,
			FEB,
			MAR,
			APR,
			MAY,
			JUN,
			JUL,
			AUG,
			SEP,
			OCT,
			NOV,
			DEC
		}
		for(Month m:Month.values()) {
			System.out.println(m);
		}
		Month month =Month.FEB;
		
		if (month == Month.FEB) {
            System.out.println("\nThe month is FEBRUARY");
        } else {
            System.out.println("\nThe month is not FEBRUARY");
        }
		
		
		
		

	}

}
