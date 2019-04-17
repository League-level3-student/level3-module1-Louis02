package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Stack<String> words = new Stack<String>();

	public static void main(String[] args) {
		HangMan hangMan = new HangMan();

	}

	public HangMan() {
		String stringInput = JOptionPane.showInputDialog("How many words would you like to guess?");
		int input = Integer.parseInt(stringInput);
		if (input < 1 || input > 266) {
			JOptionPane.showMessageDialog(null, "Please enter a number bigger than 0 but smaller than 267");
			stringInput = JOptionPane.showInputDialog("How many words would you like to guess?");
			input = Integer.parseInt(stringInput);
		}
		for (int i = 0; i < input; i++) {
			String dictionary = Utilities.readRandomLineFromFile("dictionary.txt");
			if (words.contains(dictionary) == false) {

				words.push(dictionary);
			} else {
				i--;
			}
		}
		String using = words.pop();
		int lives = 10;
		int stringLength = using.length();
		String line = "";

		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		JLabel label = new JLabel();

		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);

		for (int i = 0; i < stringLength; i++) {
			line = (line + "-");
		}

		label.setText(line + "   You have " + lives + " more lives");

		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	for(int i = 0; i<10;i++) {
		
	}
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
