package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Chooseyourownadventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int looper1 = 0;
		int looper2 = 1;
		boolean goodending = false;
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
								"A river of boiling sugar blocks your path you find several massive sugar cubes that you can make into a raft do you follow the river with a or make the raft with b or do you give up on life and straight up just walk through it with c");
						if (o3l.equals("b")) {
							JOptionPane.showMessageDialog(null, "build the raft and enter the river your raft now quickly melting so you jump to the other side barely escaping with your life");
							looper1+=1;
							looper2+=9999;
							System.out.println("help me");
						}
						if (o3l.equals("a")) {
							JOptionPane.showMessageDialog(null,
									"You follow the river to the end and see a small village");
							String o4l = JOptionPane.showInputDialog(
									"A smore creature says to you we need you to go to the top of the mountain do you listen or not");
							if (o4l.equals("no")) {
								looper1+=4543256;
								looper2+=123432;
							}
							if (o4l.equals("yes")) {
								JOptionPane.showMessageDialog(null, "A volcano that appears to have been dormant for decades erupts suddenly and within it is pure concentrated boiled sugar");
								String o5l = JOptionPane.showInputDialog("After an epic battle you faced with a gem it's gleam all beautiful do you steal it?");
								if (o5l.equals("yes")) {
									
								}
							}
						}
					}
					if (o2.equals("right")) {
						JOptionPane.showMessageDialog(null,
								"You find yourself in a blizzard after a day or so of walking in an enourmous flood and a creature that resembles a popsicle says \"I am mike I can help here is an igloo we made for visitors.");
						String o3r = JOptionPane.showInputDialog(
								" Once you leave you can either get in cone insulaters and investigate the mirage with a or move further down the path with b");
						if (o3r.equals("a")) {
							JOptionPane.showMessageDialog(null,
									"A monster sends you right back to where you started breaking every bone in your body");
							looper2 += 1;
						}
						if (o3r.equals("b")) {
							String o4r = JOptionPane.showInputDialog("A slushi river is on your path and it to viscous enough to swim through properly the question is do you now how to swim?");
							if (o4r.equals("yes")) {
								JOptionPane.showMessageDialog(null,"You can only swim through it at 30% your normal speed but enough to get through in time");
								JOptionPane.showMessageDialog(null, "Ice forms as a massive monster appears so you just throw a match at it");
								String o5r = JOptionPane.showInputDialog("A crystal with a beautiful appears do you take it or not?");
								if (o5r.equals("yes")) {
									JOptionPane.showMessageDialog(null, "A energy travels through and you you can defeat it");
									goodending = true;
									looper1+=4543256;
									looper2+=123432;
								}
								if (o5r.equals("no")) {
									looper1+=4543256;
									looper2+=123432;
								}
							}
							if (o4r.equals("no")) {
								JOptionPane.showMessageDialog(null, "You now go back after a day you find your self at the fork again");
								o2 = ("left");
							}
						}
					}
				}
			}
		}
		if (goodending==false) {
			JOptionPane.showMessageDialog(null, "The king was the demon all along without the gems you are doomed and the blessing is revoked!!!");
			JOptionPane.showMessageDialog(null, "Bad ending");
		}
		if (goodending==true) {
			JOptionPane.showMessageDialog(null, "You have got a gem! one gem has the power to defeat it, the problem is that the king is the demon");
			JOptionPane.showMessageDialog(null, "you have been turned into an a and every fight move you make is just enough to lower the health until finally it's gone, reduced to atoms");
			JOptionPane.showMessageDialog(null, "Good ending");
		}
	}
}