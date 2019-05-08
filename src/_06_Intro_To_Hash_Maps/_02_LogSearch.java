package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	HashMap<Integer, String> logSearch = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	int ID;
	int IDCheck;

	public static void main(String[] args) {
		_02_LogSearch logSearch = new _02_LogSearch();
	}

	public _02_LogSearch() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button1.setText("Add Entry");
		button2.setText("Search Entries");
		button3.setText("View Entries");
		button4.setText("Remove Entry");
		frame.setVisible(true);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button1 == e.getSource()) {
			String id = JOptionPane.showInputDialog("Create an ID Number");
			ID = Integer.parseInt(id);
			String name = JOptionPane.showInputDialog("Enter a name");
			logSearch.put(ID, name);
		}
		if (button2 == e.getSource()) {
			String idCheck = JOptionPane.showInputDialog("Enter your ID number");
			IDCheck = Integer.parseInt(idCheck);
			if (logSearch.containsKey(IDCheck)) {

				JOptionPane.showMessageDialog(null, logSearch.get(IDCheck));
			} else {
				JOptionPane.showMessageDialog(null, "Your entry doesn't exist");
				System.out.println(ID);
			}
		}
		if (button3 == e.getSource()) {
			String v = "";
			for (Integer i : logSearch.keySet()) {

				for (int q = 0; i < logSearch.size(); i++) {
					v += "ID: " + i + " Name: " + logSearch.get(i) + "\n";
				}
				
			}
JOptionPane.showMessageDialog(null, v);
		}
		if (button4 == e.getSource()) {
			String removee = JOptionPane.showInputDialog("Enter an ID");
			int remove = Integer.parseInt(removee);
			if (logSearch.containsKey(remove)) {
				logSearch.remove(remove);
			} else {
				JOptionPane.showMessageDialog(null, "This ID is not in the system");
			}
		}
	}

}
