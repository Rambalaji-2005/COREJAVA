package Basics;

//With Return Type No Parameter

public class Method_1 {
	String name2()
	{
		String fName="RAM";
		String lName="BALAJI";
		return fName+lName;
	}

	public static void main(String[] args) {
		Method_1 j=new Method_1();
		String f=j.name2();
		System.out.println("With Return Type No Parameter");
		System.out.println(f);
		System.out.println(j.name2());
	

	}

}
