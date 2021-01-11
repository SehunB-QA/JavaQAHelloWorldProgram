// Sehun Babatunde

package helloworld2javaqa;

import java.util.Random;

//import qa.sehun.anicejavapackage;

public class Runner {
	
	    boolean bool = true;
		byte bytes = 8;
		char character = 'Z';
		short shortie = 16;
		int anotherNumber = 32;
		long aLongNumber = 64L;
		float decimalNumber = 2.3f;
		double anotherDecimalNumber = 6.4d;
				
	
		
		// Flow & Control \\
		
		public static void method1()
		{
			System.out.println("Hello");
		}
		
		public static void  method2()
		{
			System.out.println("World");
		}
		
		public static String method3()
		{
			return "!";
		}
		
		
		
	    // Data Types \\
	public boolean returnbool()
	{
		System.out.println("The bool is : " + bool);
		return true;
	}
	
	public byte returnbytes()
	{
		System.out.println("The bytes is : " + bytes);
		return bytes;
	}
	
	
		//Hello World \\
	public void HelloWorldProgram()
	{
		String message = "Hello World";
		System.out.println (message);
	
		
	}
	
	
	public int rollTwoDTwenty() {
		int total = 0;
		total += rollDTwenty();
		total += rollDTwenty();
		//System.out.println("The total is : " + total);
		return total;
	}
	
	
	
	
	
	
	

	public int rollDTwenty() {
		Random randomiser = new Random();
		
		return randomiser.nextInt(21);
	}

	public static void main(String[] args) {
		Runner run = new Runner();
		System.out.println("// Hello World Program //");
		run.HelloWorldProgram();
		
		System.out.println("");
		System.out.println("// Data Types //");
		run.returnbool();
		run.returnbytes();
		
		System.out.println("");
		System.out.println("// Flow & Control //");
		method1();
	    method2();
	    System.out.println(method3());
	    
		System.out.println("");
		System.out.println("// Java Call Stack //");
	  System.out.println("The total is : " +  run.rollTwoDTwenty());
		

	}

}
