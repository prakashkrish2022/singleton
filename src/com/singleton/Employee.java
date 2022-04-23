package com.singleton;

public class Employee {
	private long maths(long k,long l) {
	System.out.println(k+l);
		return 0;

	}
	public static void main(String[] args) {
		

		Employee m=new Employee();
		
		double maths = m.maths(5, 10);
		System.out.println(maths);
		System.out.println("maths");
		double maths1 = m.maths(15, 10);
		System.out.println(maths1);
		
		double maths2 = m.maths(50, 10);
		System.out.println(maths2);
		
		
	}

}
