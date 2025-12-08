package Basics;

public class Method_2 {
	void Math3(String fname,String lname)
	{
		System.out.println(fname+lname);
	}

	public static void main(String[] args) {
		Method_2 obj=new Method_2();
		obj.Math3("RAM","BALAJI" );
		Method_2 n=new Method_2();
		n.Math3("DIYAA","SRI");
		Method_2 g=new Method_2();
		g.Math3(null, null);

	}

}
