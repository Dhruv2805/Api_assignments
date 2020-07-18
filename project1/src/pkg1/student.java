package pkg1;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.omg.CORBA.PUBLIC_MEMBER;

public class student
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
			student dhruv= new student();
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
