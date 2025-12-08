package Basics;

class C1
{
	C1()
	{
		System.out.println("Constructor");
	}
	C1(int a)
	{
		System.out.println("Constructor"+a);
	}
	void M1()
	{
		System.out.println("Class 1");
	}
}
public class Class_Obj {
	
	


	public static void main(String[] args) {
		C1 obj=new C1(12);
		C1 obj1=new C1();
		obj.M1();
		
	}

}
