package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double>doubles = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for(int i = 0; i<100;i++) {
			Random ran = new Random();
		doubles.push(ran.nextDouble()*100);
		}
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String number = JOptionPane.showInputDialog("Enter a number between 1 and 100");
		String bumber = JOptionPane.showInputDialog("Enter another number between 1 and 100");
		int num1 = Integer.parseInt(number);
		int num2 = Integer.parseInt(bumber);
		int bigger = 0;
		int smaller = 0;
		if(num1<num2) {
			bigger = num2;
			smaller = num1;
		}
		else if(num2<num1) {
			bigger=num1;
			smaller=num2;
		}
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		double currentPopped=1;
		for(int i = 0; i<doubles.size();i++) {
			currentPopped = doubles.pop();
			if(currentPopped>smaller&&currentPopped<bigger) {
				System.out.println(currentPopped);
			}
		}

		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
