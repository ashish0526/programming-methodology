import acm.program.*;
import acm.util.*;

public class RollDice extends ConsoleProgram{

	public static final int MAX_SIDES = 6;
	
	private RandomGenerator rgen = new RandomGenerator();
	
	public void run(){
		int roll;
		int t = 0;
		int Max_dices = readInt("enter the number of dices");
		int Max_roll = Max_dices * MAX_SIDES;
		while(true)
		{  
			t = t + 1;
			 roll = Roll_dice(Max_dices);
			if (roll == Max_roll)
				break;
			System.out.println("the value of roll is " + roll);
		}
		
		System.out.println("that is the maiximum value generated" + roll + " "+  t);
		}

    private int Roll_dice( int num)
    {
    	int sum = 0;
    	for( int i = 0; i < num;i++ )
    	{
    		
			sum+= rgen.nextInt(1,MAX_SIDES);

    	
    }
 return sum;

}
}