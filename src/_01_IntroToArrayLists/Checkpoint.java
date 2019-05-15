package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class Checkpoint {
	public static void main(String[] args) {
		ArrayList<Cow> cows = new ArrayList<Cow>();
		Random rn = new Random();
		int r = rn.nextInt(100);
		
		for (int i = 0; i < r; i++) {
			Cow cow = new Cow();
			cows.add(cow);
		}
		for(int i = 0; i<cows.size();i++) {
		cows.get(i).feed();
		}
		
	}
	
}

class Cow {
	public void feed() {
		
	}
}
