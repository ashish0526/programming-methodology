/*
 * File: HangmanCanvas.java
 * ------------------------
 * This file keeps track of the Hangman display.
 */

import acm.graphics.*;

public class HangmanCanvas extends GCanvas{

/** Resets the display so that only the scaffold appears */

	
	public void reset() {
		/* You fill this in */
		GLine line  = new GLine(getWidth()/2,getHeight(),getWidth()/2,getHeight() + SCAFFOLD_HEIGHT);
	    add(line);
	    GLine gline = new GLine(getWidth()/2,getHeight() ,getWidth()/2 +  BEAM_LENGTH,getHeight() ) ;
	    add(gline);
	    GLine nline = new GLine(getWidth()/2 + BEAM_LENGTH,getHeight(),getWidth()/2 + BEAM_LENGTH,getHeight() + ROPE_LENGTH);
	    add(nline);
	    
		
		
	}

/**
 * Updates the word on the screen to correspond to the current
 * state of the game.  The argument string shows what letters have
 * been guessed so far; unguessed letters are indicated by hyphens.
 */
	public void displayWord(String word) {
		/* You fill this in */
		
		System.out.println("Your word now look like this " + word);
	}

/**
 * Updates the display to correspond to an incorrect guess by the
 * user.  Calling this method causes the next body part to appear
 * on the scaffold and adds the letter to the list of incorrect
 * guesses that appears at the bottom of the window.
 */
	public void noteIncorrectGuess(char letter,int counter) {
		
		switch(counter){
		case 8:GOval myoval = new GOval(getWidth()/2 + BEAM_LENGTH - HEAD_RADIUS,getHeight() + ROPE_LENGTH,2*HEAD_RADIUS,2*HEAD_RADIUS);
		      add(myoval);
		      break;
		      
		      
		case 7 :
			GLine nline = new GLine(getWidth()/2 + BEAM_LENGTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS,getWidth()/2 + BEAM_LENGTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH );
		      add(nline);
		      break;
		case 6:
			 GLine pline = new GLine(getWidth()/2 + BEAM_LENGTH,getHeight() + 2*HEAD_RADIUS +  ROPE_LENGTH + ARM_OFFSET_FROM_HEAD,getWidth()/2 + BEAM_LENGTH - UPPER_ARM_LENGTH ,getHeight() + ROPE_LENGTH + ARM_OFFSET_FROM_HEAD + 2*HEAD_RADIUS );
			 add(pline);
			 GLine tline = new GLine(getWidth()/2 + BEAM_LENGTH ,getHeight() + ROPE_LENGTH + ARM_OFFSET_FROM_HEAD + 2*HEAD_RADIUS,getWidth()/2 + BEAM_LENGTH + UPPER_ARM_LENGTH,getHeight() + ROPE_LENGTH + ARM_OFFSET_FROM_HEAD + 2*HEAD_RADIUS  );
		     add(tline);
		     break;
		case 5 :
			GLine zline = new GLine(getWidth()/2 + BEAM_LENGTH - UPPER_ARM_LENGTH,getHeight() + ROPE_LENGTH + ARM_OFFSET_FROM_HEAD + 2*HEAD_RADIUS,getWidth()/2 + BEAM_LENGTH - UPPER_ARM_LENGTH ,getHeight() + ROPE_LENGTH + ARM_OFFSET_FROM_HEAD + 2*HEAD_RADIUS + LOWER_ARM_LENGTH );
			 add(zline);
			 GLine yline = new GLine(getWidth()/2 + BEAM_LENGTH + UPPER_ARM_LENGTH ,getHeight() + ROPE_LENGTH + ARM_OFFSET_FROM_HEAD + 2*HEAD_RADIUS,getWidth()/2 + BEAM_LENGTH + UPPER_ARM_LENGTH,getHeight() + ROPE_LENGTH + ARM_OFFSET_FROM_HEAD + 2*HEAD_RADIUS + LOWER_ARM_LENGTH );
		     add(yline);
		     break;
		case 4:
			GLine mline = new GLine(getWidth()/2 + BEAM_LENGTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH ,getWidth()/2 + BEAM_LENGTH + HIP_WIDTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH );
			add(mline);
			GLine kline = new GLine(getWidth()/2 + BEAM_LENGTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH ,getWidth()/2 + BEAM_LENGTH - HIP_WIDTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH );
		    add(kline);
		    break;
		case 3:
			GLine bline = new GLine(getWidth()/2 + BEAM_LENGTH + HIP_WIDTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH,getWidth()/2 + BEAM_LENGTH + HIP_WIDTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH +LEG_LENGTH );
		    add(bline);
		     GLine cline = new GLine(getWidth()/2 + BEAM_LENGTH - HIP_WIDTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH,getWidth()/2 + BEAM_LENGTH - HIP_WIDTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH + LEG_LENGTH);
		    add(cline);
		    break;
		case 2:
			GLine dline = new GLine(getWidth()/2 + BEAM_LENGTH + HIP_WIDTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH +LEG_LENGTH ,getWidth()/2 + BEAM_LENGTH + HIP_WIDTH + FOOT_LENGTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH +LEG_LENGTH );
			add(dline);
			GLine eline = new GLine(getWidth()/2 + BEAM_LENGTH - HIP_WIDTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH + LEG_LENGTH,getWidth()/2 + BEAM_LENGTH - HIP_WIDTH- FOOT_LENGTH,getHeight() + ROPE_LENGTH + 2*HEAD_RADIUS + BODY_LENGTH + LEG_LENGTH);
		    add(eline);
		    break;
		
		default :
			System.out.println("You lose you are now hannged ");
			
		
		
		}
		/* You fill this in */
	}

/* Constants for the simple version of the picture (in pixels) */
	private static final int SCAFFOLD_HEIGHT = 360;
	private static final int BEAM_LENGTH = 144;
	private static final int ROPE_LENGTH = 18;
	private static final int HEAD_RADIUS = 36;
	private static final int BODY_LENGTH = 144;
	private static final int ARM_OFFSET_FROM_HEAD = 28;
	private static final int UPPER_ARM_LENGTH = 72;
	private static final int LOWER_ARM_LENGTH = 44;
	private static final int HIP_WIDTH = 36;
	private static final int LEG_LENGTH = 108;
	private static final int FOOT_LENGTH = 28;

}
											