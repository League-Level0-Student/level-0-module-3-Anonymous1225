
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
		String color =JOptionPane.showInputDialog(null, "Any colors?");
		int hello = Integer.parseInt(color);
		ort.penDown();
		ort.setPenColor(hello,hello,hello);
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
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
