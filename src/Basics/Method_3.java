package Basics;

public class Method_3 {
	public String math(String fname,String lname)
	{
		return fname+lname;
	}

	public static void main(String[] args) {
		Method_3 obj=new Method_3();
		String result=obj.math("ANU", "SHRUTHI");
		System.out.println(result);
		Method_3 obj1=new Method_3();
		System.out.println(obj1.math("SJ","HARINI"));
	

	}

}
