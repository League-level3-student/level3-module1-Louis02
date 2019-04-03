package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char c;

	Stack<Character> deleted = new Stack<Character>();

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	public static void main(String[] args) {
		new _02_TextUndoRedo();

	}

	public _02_TextUndoRedo() {
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String s = label.getText();
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if (s.length() < 1) {

			} else {
				char u = s.charAt(s.length() - 1);
				deleted.push(u);
				String i = s.substring(0, s.length() - 1);
				label.setText(i);
			}
		} else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
			if (deleted.isEmpty()) {

			} else {
				label.setText(s + "" + deleted.pop());
			}
		} else {
			c = e.getKeyChar();

			s += c;
			label.setText(s);

		}
		frame.pack();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}