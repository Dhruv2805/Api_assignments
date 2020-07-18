package org.testing.Utilities;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Current_Date_Time 
{
	public static void D_T()
	{
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
	}    
		 
	
}
