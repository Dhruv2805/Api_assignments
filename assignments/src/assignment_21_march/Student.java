package assignment_21_march;

public class Student 
{
	
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("welcome to all of you");	
	}

	public void display2()
	{
		System.out.println("selenium is a good tool");
	}

	public static void main(String[] args)
    {
		Student dhruv= new Student();
		dhruv.display1();
		dhruv.display2();
		dhruv.age=24;
		System.out.println(dhruv.age);
		dhruv.rollno=1111;
		System.out.println(dhruv.rollno);
		dhruv.age=25;
		System.out.println(dhruv.age);
		dhruv.rollno=1001;
		System.out.println(dhruv.rollno);

    }


	
}
