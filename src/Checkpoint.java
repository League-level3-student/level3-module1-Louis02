import java.util.Random;
import java.util.Stack;

public class Checkpoint {
	public static void main(String[] args) {
		Stack<Integer> intStack = new Stack<Integer>();

		for (int i = 0; i < 10; i++) {
			Random rn = new Random();
			int r = rn.nextInt(10);
			intStack.push(r);
			System.out.println(r);
		}
		int total = 0;
		for (int i = 0; i < 10; i++) {
			total += intStack.pop();

		}
		System.out.println(total);
	}
}
