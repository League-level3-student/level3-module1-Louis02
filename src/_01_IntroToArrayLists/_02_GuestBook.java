package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	ArrayList<String> array = new ArrayList<String>();

	public static void main(String[] args) {
		new _02_GuestBook();
	}
	public _02_GuestBook () {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		frame.pack();
		add();
		view();

	}

	public void add() {
		add.addActionListener(this);
	}
	public void view() {
		view.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (add == e.getSource()) {
			String name = JOptionPane.showInputDialog("PLease Enter Your Name");
			array.add(name);
		}
		else if (view==e.getSource()) {
			for(int i = 0; i <array.size(); i++) {
			System.out.println("Guest Number "+ (i+1) + " "+  array.get(i));
			}
		}
	}

}
