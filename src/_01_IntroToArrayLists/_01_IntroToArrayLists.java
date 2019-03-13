package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> string = new ArrayList<String>();
		// 2. Add five Strings to your list
		string.add("Tom");
		string.add("Zach");
		string.add("Luka");
		string.add("Joe");
		string.add("Alex");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < string.size(); i++) {
			// System.out.println(string.get(i));

		}

		// 4. Print all the Strings using a for-each loop
		for (String s : string) {
			// System.out.println(s);
		}
		// 5. Print only the even numbered elements in the list.

		for (int i = 1; i < string.size(); i += 2) {
			System.out.println(string.get(i));
		}
		System.out.println("   ");
		// 6. Print all the Strings in reverse order.
		for (int i = string.size() - 1; i >= 0; i--) {
			System.out.println(string.get(i));
		}
		System.out.println("    ");
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < string.size(); i++) {
		
			if(string.get(i).contains("e") == true) {
				System.out.println(string.get(i));
			}
		}
	}
}
