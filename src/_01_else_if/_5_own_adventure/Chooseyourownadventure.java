package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Chooseyourownadventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int looper1 = 0;
		int looper2 = 1;
		while (looper1 == 0) {
			looper2 -= 1;
			while (looper2 == 0) {
				String o1 = JOptionPane.showInputDialog(
						"It looks like you have been left behind at the woods what do you choose,a means you go into an unauthorized area, b means you run for your life striaght to your house");
				if (o1.equals("b")) {
					JOptionPane.showMessageDialog(null, "Don't choose b that's the boring option.");
					looper2 += 1;
				}
				if (o1.equals("a")) {
					JOptionPane.showMessageDialog(null, "You find a portal then enter it");
					String o2 = JOptionPane.showInputDialog(
							"You find yourself suddenly on a massive marshmallow you descend and find a chocalate thing of indescribable properties, it tells you in a language that you have never heard but still understand \"This land is of my command you shall be chosen to defend this land from unknown deities I bless you with reincarnation upon death\" you follow its command and later you find a fork in your path left or right?");
					if (o2.equals("left")) {
						String o3l = JOptionPane.showInputDialog(null,
								"A river of boiling sugar blocks your path you find several massive sugar cubes that you can make into a raft do you follow the river with a or make the raft with b or do you give up on life and straight just walk through it with c");
						if(o3l.equals("a")) {
							JOptionPane.showMessageDialog(null, "You build the raft and enter the river it is now quickly melting so you jump to the other side barely escaping with your life.");
							String o4l = JOptionPane.showInputDialog("A smore creature says to you we need you to go to the top of the mountain do you listen or not");
						}
					}
					if (o2.equals("right")) {
						JOptionPane.showMessageDialog(null,
								"You find yourself in a blizzard after a day or so of walking in an enourmous flood and a creature that resembles a popsicle says \"I am mike I can help here is an igloo we made for visitors.");
						String o3r = JOptionPane.showInputDialog(" Once you leave you can either get in cone insulaters and investigate the mirage with a or move further down the path with b");
					}
				}
			}
		}
	}
}