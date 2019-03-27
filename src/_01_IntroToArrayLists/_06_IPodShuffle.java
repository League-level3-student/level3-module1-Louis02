package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015
;

public class _06_IPodShuffle implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	ArrayList<Song> theSong = new ArrayList<Song>();
	Song currentSong = null;
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

		theSong.add(new Song("Like_It.mp3"));
		theSong.add(new Song("Lazy_Song.mp3"));
		theSong.add(new Song("Panda.mp3"));
		frame.add(panel);
		panel.add(button);
		frame.setVisible(true);
		button.setText("Suprise Me");
		button.addActionListener(this);
		frame.pack();

	}

	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button == e.getSource()) {
			Random ran = new Random();
			int r = ran.nextInt(theSong.size());
			if (currentSong!=null) {
				currentSong.stop();
			}
			theSong.get(r).play();
			currentSong = theSong.get(r);
			System.out.println(theSong.get(r));
			
		}
	}
}