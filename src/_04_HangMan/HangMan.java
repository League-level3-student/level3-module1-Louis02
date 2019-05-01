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
	String using;
	int stringLength;
	int lives;
	JLabel label = new JLabel();
	JLabel llabel = new JLabel();
	String line = "";
	JPanel panell = new JPanel();
	boolean transfer;
	int choice;

	public static void main(String[] args) {
		HangMan hangMan = new HangMan();

	}

	public HangMan() {
		restart();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char keyTyped;
		String results = "";
		transfer = false;
		for (int i = 0; i < line.length(); i++) {

			keyTyped = e.getKeyChar();
			if (keyTyped == using.charAt(i)) {
				results += using.charAt(i);
				transfer = true;
			} else {
				results += line.charAt(i);

			}

		}

		if (transfer == false) {
			lives--;
		}
		System.out.println(lives);
		line = results;
		if (lives < 1) {
			line = "";
			using = "";
			Question();
		}

		label.setText(line);
		if (line.equals(using)) {

			
			lives = 10;
			line = "";
			using = "";
			if (words.isEmpty() == true) {
				Question();
			}
			else {
				setup();
			}
		}

	}

	public void Question() {

		if (words.isEmpty() == true) {
			choice = JOptionPane.showOptionDialog(null, "Do you want to play again", "Choice",
					JOptionPane.YES_NO_OPTION, 0, null, null, 0);
			// 0 yes 1 no

		}
		else if (lives<=0) {
			choice = JOptionPane.showOptionDialog(null, "Do you want to play again", "Choice",
					JOptionPane.YES_NO_OPTION, 0, null, null, 0);
		}
		if (choice == 0) {
			restart();
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void restart() {
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
		setup();
	}

	public void setup() {
		using = words.pop();
		lives = 10;
		stringLength = using.length();

		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.add(panell);
		panell.add(llabel);
		frame.add(panel);
		panel.add(label);

		frame.setVisible(true);
		frame.addKeyListener(this);

		for (int i = 0; i < stringLength; i++) {
			line = (line + "-");
		}

		label.setText(line);
		llabel.setText("You have " + lives + " lives left");

		frame.pack();
	}

}
