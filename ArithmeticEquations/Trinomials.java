package ArithmeticEquations;

import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.regex.Pattern;

public class Trinomials {
	
	public static void main(String [] args) {
		
		System.out.println(BasicForm("x²-7x+12"));
		
	}
	
	public static String BasicForm(String equation) {
		
		String chain[]=equation.split("[-+]");
		String symbols[]=equation.split("[0123456789abcdefghijklmnopqrstuvwxyz³²¹]");
		
		String co=chain[1];
		co.split("abcdefghijklmnopqrstuvwxyz³²¹");
		
		String co2=chain[2];
		co2.split("abcdefghijklmnopqrstuvwxyz³²¹");
		
		int coeficient=Integer.parseInt(co);
		int coeficient2=Integer.parseInt(co2);
		
		String result="NULL";
		
		if(symbols[1]=="+" && symbols[3]=="-") {
			
			
			
		}
		
		return "";
		
	}
	
	public int FindMinusForNumber(int num1, int num2) {
		
		
		
		return 0;
		
	}

}
