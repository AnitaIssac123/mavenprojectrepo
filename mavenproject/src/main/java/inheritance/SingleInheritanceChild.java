package inheritance;

public class SingleInheritanceChild extends SingleInheritanceParent


{
	public void childMethod()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		SingleInheritanceChild obj=new SingleInheritanceChild();
		obj.childMethod();
		obj.instancemethod();
		
		
	}

}
