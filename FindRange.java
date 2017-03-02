/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		
		int min = 0;
		 int max = 0;
		/* You fill this in */
	while(true)
	{
	  int	a = readInt("enter the number :");
	 if(a == 0)
		 break;
	 else{
		 
		 if (a < min)
			 min = a;
		 if(a > max)
			 max = a;
	 }
	 }
	    System.out.print(min);
	    System.out.println(" " + max);
	    	
		
		
	}
}

