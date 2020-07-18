package execution_order;
/***********order is 1.static...2.constructor....3.main method **************/
public class Example_class 
{
	static{
	      System.out.println("Hello this is a static block");
	   }
	Example_class(){
	      System.out.println("Hello this a constructor");
	   }
	   public static void demo() {
	      System.out.println("Hello this is an instance method");
	   }
	   public static void main(String args[])
	   {
		   /********order as we difined which one first in main method**********/
	      new Example_class().demo();
	      System.out.println("this is the main method");
	   }
}
