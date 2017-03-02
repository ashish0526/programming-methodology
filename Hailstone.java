/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		int n = readInt() ;
		
		while(true)
		{
			
			if( n == 1)
				break;
			else if( n%2 == 0)
			{ 
			  System.out.println(n +"is even ,so I take half " + n/2);
			  n = n/2;}
			else
				{System.out.println(n +"is odd ,so I make 3n +1 " + 3*n +1);
				n = 3*n+1;
				}
		}
		
		/* You fill this in */
	}
}

