package assignment_11_April;

public class Rectangle2				//method overloading_2
{
	public int Area(int L ,int B)		//method name is same 
										//method inputs (int,int) 
										//method output  is Int.
	{
		int A;
		A=L*B;
		return A;
		
	}
	
	public void Area(int L ,float B)		//method name is same
											//method inputs (int,float)
											//method output  is void.
	{
		float A;
		A=L*B;
		System.out.println("area of rectancle from Area method with one int and float inputs is " + A);
	}

	public static void main(String[] args) 
	{	
		Rectangle rect=new Rectangle();
		rect.Area(10, 30);
		rect.Area(10,10.2F);
	}

}
