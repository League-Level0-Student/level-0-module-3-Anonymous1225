
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		int randomlooper = new Random().nextInt(10)+1;
	    int looper = 0;
	    while (looper <=randomlooper) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		

		// 1. Ask the user for a guess using a pop-up window, and save their response 


    	String guess = JOptionPane.showInputDialog(null, "guess a random number");
    	int intguess = Integer.parseInt(guess);
		// 2. Print out the random variable above
		if (intguess == random) {
			JOptionPane.showMessageDialog(null, "You're correct!");
			System.exit(0);
		}
		else if (intguess > random){
			JOptionPane.showMessageDialog(null, "Too high!");
		}
		else if(intguess < random) {
			JOptionPane.showMessageDialog(null, "Too low!");
		}
		// 11. Repeat steps 1 to 10 ten times
		looper+=1;
    }


	}

}