package com.cst.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public int num1;
	public int num2;
	
    public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int addFunc(int num1, int num2) {
		return num1+num2;
	}
	public int diffFunc(int num1, int num2) {
		return num1-num2;
	}
	public int prodFunc(int num1, int num2) {
		return num1*num2;
	}
	

	public static void main( String[] args )
    {
		App calculator=new App();
		Scanner input = new Scanner(System.in);
		
		System.out.println( "enter number1");
		int num1 = input.nextInt();
		calculator.setNum1(num1);
		System.out.println( "enter number2");
		int num2 = input.nextInt();
		calculator.setNum2(num2);
		System.out.println("the sum is : "+calculator.addFunc(num1, num2));
		System.out.println("the diff is : "+calculator.diffFunc(num1, num2));
		System.out.println("the Prod is : "+calculator.prodFunc(num1, num2));
			
		}
}
