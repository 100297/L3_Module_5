package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		int right = 0;
		int left = 0;
		for (int i = 0; i < b.length(); i++) {
			if (b.substring(i, i + 1).equals("{")) {
				right++;
			}
			if (b.substring(i, i + 1).equals("}") && left < right) {
				left++;
			}

		}
		if (left == right) {
			return true;
		} else {
			return false;
		}

	}

}