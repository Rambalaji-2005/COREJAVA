package Basics;
import java.util.Scanner; 

public class First {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your surname");
		char Surname=sc.next().charAt(5);
		sc.nextLine();
		System.out.println("Enter your name:");
		String Name=sc.nextLine();
		System.out.println("Enter your Age");
		int Age=Integer.parseInt(sc.nextLine());
		System.out.println("Enter a Float Value");
		float F=Float.parseFloat(sc.nextLine());
		System.out.println("Enter a double value:");
		double di=Double.parseDouble(sc.nextLine());
		System.out.println("Enter a short value");
		short S1=Short.parseShort(sc.nextLine());
		System.out.println("Enter a byte value");
		byte B=Byte.parseByte(sc.nextLine());
		
		System.out.println("\n Your Surname is:"+Surname);
		System.out.println("Your Name is:"+Name);
		System.out.println("Your Age is:"+Age);
		System.out.println("Entered Float:"+F);
		System.out.println("Entered Double:"+di);
		System.out.println("Entered Short:"+S1);
		System.out.println("Entered Byte:"+B);
		sc.close();
		
		

	}

}
