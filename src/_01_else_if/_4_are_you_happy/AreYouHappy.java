package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String happy = JOptionPane.showInputDialog("Are you happy");
if (happy.equals("yes")) {
	JOptionPane.showMessageDialog(null, "Not for long");
}
else if (happy.equals("no")) {
	String want = JOptionPane.showInputDialog(null,"Do you want to be happy?");
	if (want.equals("yes")) {
		JOptionPane.showMessageDialog(null, "May you never find it");
	}
	else if (happy.equals("no")) {
		JOptionPane.showMessageDialog(null,"Then why are you alive?");
	}
}
	}

}
