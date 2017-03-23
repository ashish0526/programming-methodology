/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class SyllableCounting extends ConsoleProgram {
	public void run() {
		/* Repeatedly prompt the user for a word and print out the estimated
		 * number of syllables in that word.
		 */
		while (true) {
			String word = readLine("Enter a single word: ");
			println("  Syllable count: " + syllablesIn(word));
		}
	}
	
	/**
	 * Given a word, estimates the number of syllables in that word according to the
	 * heuristic specified in the handout.
	 * 
	 * @param word A string containing a single word. 
	 * @return An estimate of the number of syllables in that word.
	 */
	private int syllablesIn(String word) {
		// TODO: Delete this comment and implement this method.
        int counter = 0;
		boolean lastIsVowel = false;
		for(int i = 0;i<word.length();i++){
			if(i!=word.length()-1){
				
			
			if(word.charAt(i) == 'a'|word.charAt(i)=='i'|word.charAt(i) == 'o'|word.charAt(i) == 'e'|word.charAt(i) == 'u'|word.charAt(i) == 'y'){
			    if(!lastIsVowel){
			    	counter++;
			    	lastIsVowel = true;
			    }
			    
			}
			else
		    	lastIsVowel = false;
		
			}
			else{
			
				if(word.charAt(i)=='a'|word.charAt(i)=='i'|word.charAt(i) == 'o'|word.charAt(i) == 'u'|word.charAt(i) == 'y'){
					if(!lastIsVowel){
						counter++;
						lastIsVowel = true;
					}
				}
					
			}
		}
		
		if(counter!=0)
		return counter;
	
		else
			return 1;
	}
}
