
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot ort = new Robot();
		ort.penDown();
		ort.setPenWidth(10);
		ort.setSpeed(30);
		ort.move(200);
		ort.turn(72);
		ort.move(200);
		ort.turn(72);
		ort.move(200);
		ort.turn(72);
		ort.move(200);
		ort.turn(72);
		ort.move(200);
		ort.turn(72);
		int looper =0;
		while (looper<1) {
		String color =JOptionPane.showInputDialog(null, "Any colors?");

		ort.penDown();
		if (color.equals("red")) {
			ort.setPenColor(255,0,0);
		}
		else if(color.equals("blue")) {
			ort.setPenColor(0,0,255);
		}
		else if(color.equals("green")) {
			ort.setPenColor(0,128,0);
		}
		else if(color.equals("yellow")) {
			ort.setPenColor(255,255,0);
		}
		else if(color.equals("purple")) {
			ort.setPenColor(128,0,128);
		}
		else if(color.equals("white")) {
			ort.setPenColor(255,255,255);
		}
		else if(color.equals("black")) {
			ort.setPenColor(0,0,0);
		}
		else if(color.equals("grey")) {
			ort.setPenColor(128,128,128);
		}
		else if(color.equals("pink")) {
			ort.setPenColor(255,192,203);
		}
		else if(color.equals("brown")) {
			ort.setPenColor(128,64,0);
		}
		else if(color.equals("orange")) {
			ort.setPenColor(255,128,0);
		}
		ort.setPenWidth(10);
		ort.setSpeed(30);
		ort.move(200);
		ort.turn(72);
		ort.move(200);
		ort.turn(72);
		ort.move(200);
		ort.turn(72);
		ort.move(200);
		ort.turn(72);
		ort.move(200);
		ort.turn(72);
		
		}
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
