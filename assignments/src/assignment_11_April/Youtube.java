package assignment_11_April;

public class Youtube extends Channel
{
	public void child()
	{
		System.out.println("child class method ");
	}
	public void M2()		//M2 body is given by inherited class=Youtube 
	{
		System.out.println("M2 abstract method body given by child class Youtube");
	}
	public void M3()		//M3 body is given by inherited class=Youtube 
	{
		System.out.println("M3 abstract method body given by child class Youtube");
	}
	public static void main(String[] args)
	{
		Youtube yt=new Youtube();
		yt.child();			//child method called..
		yt.M2();			//M2 abstract method is called using inheritance.
		yt.M3();			//M3 abstract method is called using inheritance.
	}

}
