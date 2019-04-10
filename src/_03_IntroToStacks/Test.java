package _03_IntroToStacks;

import java.util.Random;

import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a number");
		int num = Integer.parseInt(input);
		int[] numbers = new int[num];
		int smallest = numbers[0];
		int largest = numbers[0];
		int average=numbers[0];
		for (int i = 0; i < num; i++) {
			numbers[i] = new Random().nextInt();
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			
				
			average =average+numbers[i];
			
			
			
		}
		
		average=average/num;
	System.out.println(average);

		System.out.println(smallest);

		System.out.println(largest);
	}

}
