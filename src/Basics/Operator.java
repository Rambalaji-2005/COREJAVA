package Basics;
import java.util.Scanner;

public class Operator {
	public static void main(String args[])
	{
		float a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a and b value:");
		a=scan.nextFloat();
		b=scan.nextFloat();
		
		//Arithmetic Operator
		c=a+b;
		System.out.println("Addition value:"+c);
		c=a-b;
		System.out.println("Subtraction value:"+c);
		c=a*b;
		System.out.println("Multiplication value:"+c);
		c=a/b;
		System.out.println("Division Value:"+c);
		c=a%b;
		System.out.println("Percentage Value:"+c);
		
		//Assignment Operator
		c=a;
		System.out.println("Equal:"+c);
		c+=a;
		System.out.println("Plus or Equal:"+c);
		c-=a;
		System.out.println("Minus or Equal:"+c);
		c*=a;
		System.out.println("Multiply or Equal:"+c);
		c/=a;
		System.out.println("Divide or Equal:"+c);
		c%=a;
		System.out.println("Percentage or Equal:"+c);
		
		
		
		

		// Relational operations
		System.out.println("a = " + a + ", b = " + b);

		System.out.println("a == b : " + (a == b));  
		System.out.println("a != b : " + (a != b));
		System.out.println("a >  b : " + (a > b));  
		System.out.println("a <  b : " + (a < b));   
		System.out.println("a >= b : " + (a >= b));  
		System.out.println("a <= b : " + (a <= b)); 
		
		//Logical Operator
		boolean x=true,y=false;
		System.out.println("AND:"+(x&y));
		System.out.println("OR:"+(x|y));
		System.out.println("NOT:"+(!y));
		
		//Unary Operator
		int d=10;
		boolean z=true;
		System.out.println("d:"+d);
		System.out.println("Unary +:"+(+a));
		System.out.println("Unary -:"+(-a));
		System.out.println("a++ (Pre-Increment):"+(a++));
		System.out.println("After a++"+(a++));
		System.out.println("++a (Post-Increment):"+(++a));
		System.out.println("After ++a"+(++a));
		
		
		
		}
	
	
	
	
	
		

	
	}
	


