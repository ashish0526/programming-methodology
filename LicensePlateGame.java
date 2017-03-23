/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import java.io.*;
import java.util.*;

public class LicensePlateGame extends ConsoleProgram {
	private static final String DICTIONARY_FILE = "dictionary.txt";
	ArrayList<String>  total = new ArrayList<String>();
	public void run(){
		
		while(true){
			String input = readLine("Enter license plate number");
		
		if(input.length()==3){
		try{
			
			BufferedReader br = new BufferedReader(new FileReader(DICTIONARY_FILE));
			while(true){
				String line = br.readLine();
				if(line == null)
					break;
				else{
					int j =0;
					
		     for(int i = 0; i<input.length();i++){			
		    	 
		    	 while(j<line.length()){
		    		 if(Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(line.charAt(j))){
		    			 
		    			 if(i == input.length()-1){
		    				 
		    				 total.add(line);
		    				 System.out.println(line);
		    				 break;
		    			 }
		    			 j++;
		    			 break;
		    			 
		    		 } 
		    		 j++;
		    		 if(j==line.length())
		    			 break;
		    		 
		    		 
		    	 }
		    	 
		    	 
		    		 
		    	 }
					
					
					
					
				}
				
				
				
			}
			
			br.close();
		}catch(IOException e)
		{
			System.out.println("you suck");
			
		}
		
		
		}
		
		
		
	}
	
	}
}
