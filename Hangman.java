/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;

import java.awt.*;

public class Hangman extends ConsoleProgram {

	
	
	  public HangmanCanvas canvas;

	  public void init(){
		  
		  canvas = new HangmanCanvas();
		  add(canvas);
		   System.out.println("Welcome to Hangman");  
	  }
    public void run() {
		/* You fill this in */
    	 canvas.reset();
    	 rg = RandomGenerator.getInstance();
         int index = rg.nextInt(0,9);
         hang = new HangmanLexicon();
         
          //word = hang.getWord(index);
         try{
         BufferedReader br = new BufferedReader(new FileReader("HangmanLexicon.txt"));
         
           while(true){
        	   String line = br.readLine();
        	   if(line == null)
        		   continue;
        	   ArrayList<String>  kt = new ArrayList<String>();
        	   
        	   
        	   
           }
         for(int k = 0; k < word.length();k++){
       	  t = t + "-";
       	  
         }
         
    	while(counter >=0){
    	
    	setup();
    	
    	
    	
    	
    	}
    	
	}

    
    private void setup(){
    	
    	
    	
    	
      
      int k = word.length();
      
      int i  = 65;
      int temp = rg.nextInt(0,25);
    	char c =  (char)(i + temp);
    	boolean presentcharacter = false;
        
    	canvas.displayWord(t);
    	System.out.println("you have only " + counter + " cases left");
      System.out.println("Your Guess "+ c);
       for(int j = 0; j<word.length();j++){
    		
    		if(word.charAt(j) ==  c){
    			presentcharacter = true;
    			k--;
    		}
    	}
    	
    	
      
    	if(presentcharacter){
    		for(int num = 0; num<word.length();num++){
    			if(word.charAt(num) == c){
    				System.out.println("you guessed it right");
    				t = t.substring(0,num) +c +t.substring(num+1,t.length());
    			   	
    			}
    			
    		}
    		
    		
    		
    		
    	}
    	
    		canvas.noteIncorrectGuess(c, counter);
    		
    		
    	
    	counter--;
      
      
    	 if(k == 0){
    	    	
    	    	System.out.println("you have won this game");
    	    	System.out.println("Congratulations");
                   return;    	    	
    	    	
    	    	
    	    }
     
       }
    
  

    private String t = "" ;
  public String word;
public  int counter = 8;
    private HangmanLexicon hang;
    private RandomGenerator rg;
}