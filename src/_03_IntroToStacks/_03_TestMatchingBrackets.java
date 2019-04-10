package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	Stack<String> brackets = new Stack<String>();

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '{') {
				brackets.push("{");

			}
			if (b.charAt(i) == '}') {
				if (brackets.empty()) {
					return false;
				} else  {
					brackets.pop();
				}
			}
		}
		if (brackets.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

}