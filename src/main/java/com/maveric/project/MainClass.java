package com.maveric.project;

public class MainClass {
	public static void main(String[] args) {
		
		int a=100 , b=100;
		
		if(a==b)  // condition check will be done by if -else to decide next flow off code 
			System.out.println("Will continue the app dev");
		else
			System.out.println("Will stop the app dev");
		
		// assertion check will be done for assumption || expection check
		// assertion is by default disable, explicitly need to enable using command-line vm arg  "-ea"
		//assert keyword added in jdk 1.4
		assert (a !=b);
	
	}
}
