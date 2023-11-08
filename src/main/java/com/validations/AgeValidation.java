package com.validations;

//import java.util.ResourceBundle;
import java.lang.Math;

public class AgeValidation {
	
	public String validateAge(int age)
	{
		//ResourceBundle rb = ResourceBundle.getBundle("config");
		
		//int age = Integer.parseInt(rb.getString("age"));
		if(age>0 && age<=100)
		{
			if(age>=18) {
				return "Valid age and eligible for vote";
			}
			else {
				return "Valid age and not eligible for vote";
			}
		}
		else
		{
			return "Not an valid age";
		}
	}
	
	public int arthematicOperations(int a, int b, String op) {
		if((a>0 && b>0) || (a<0 && b<0)) {
			if(op == "+") {
				return Math.abs(a+b);
			}
			else if(op == "-") {
				return Math.abs(a-b);
			}
			else if(op == "*") {
				return Math.abs(a*b);
			}
			else if(op == "%") {
				return Math.abs(a%b);
			}
		}
		else {
			if(op == "+") {
				return (a+b);
			}
			else if(op == "-") {
				return (a-b);
			}
			else if(op == "*") {
				return (a*b);
			}
			else if(op == "%") {
				return (a%b);
			}
		}
		return 0;
	}
}
