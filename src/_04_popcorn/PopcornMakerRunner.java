package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMakerRunner {
public static void main(String[] args) {
	
	
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	Popcorn yum = new Popcorn(flavor);
	Microwave warm = new Microwave();
	warm.putInMicrowave(yum);
	yum.applyHeat();
	String minutes = JOptionPane.showInputDialog("How long should we cook the popcorn?");
	int time = Integer.parseInt(minutes);
	warm.setTime(time);
}
}
