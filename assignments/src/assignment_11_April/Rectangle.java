package assignment_11_April;

public class Rectangle 					//method Overloading_1
{
	public void Area(int L ,int B)		//method name is same 
										 //method inputs (int,int) 
										//method output  is same =void.
	{
		int A;
		A=L*B;
		System.out.println("area of rectancle from Area method with integer inputs is " + A);
	}
	public void Area(int L ,float B)		//method name is same
											//method inputs (int,float)
											//method output  is same =void.
	{
		float A;
		A=L*B;
		System.out.println("area of rectancle from Area method with one int and float inputs is " + A);
	}
	
	public static void main(String[] args) 
	{	
		Rectangle rect=new Rectangle();
		rect.Area(10, 20);
		rect.Area(10,10.2F);
		
	}

}
