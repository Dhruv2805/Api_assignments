package org.testing.Assertions;

public class Assertion {
	
		public static Boolean assertion(String Expected,String Actual)
		{
			if(Expected.equals(Actual))
			{
				System.out.println("our expected data matches with the actual data ");
			}
			else
			{
				System.out.println("our expected data doesn't matches with the actual data ");
			}
			return true;
		}

	}


