import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.util.Arrays;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class StringExercise {

	public static void main(String[] args) {
		System.out.println("Exercise 1");
		String text = "What the Air Force academy hate crime hoax teaches us about the mainstrrteam media and race";
		System.out.println(replaceLetterInTextWords(text, 2));
		System.out.println("");

		System.out.println("Exercise 8");
		String text2 = "What the Air Force *Academy hate* crime hoax teaches us about the mainstream media and race";
		System.out.println(text2);
		System.out.println(removeLetterBetweenSymbols(text2, '*'));
		System.out.println("");

		System.out.println("Exercise 2");
		String text3 = "What the Air Force academy hate crime hoax teaches us about the mainstrrteam media and race";
		char[] arrayCh = null;
		arrayCh = splitTextOnLetters(text3);
		printEveryCharInArray(arrayCh);
		printEveryCharAlphabetNumber(arrayCh);
		System.out.println("");

		System.out.println("Exercise 9");
		String text4 = "What the Air Force What the df Air What";
		printWordsPepeats(text4);
		System.out.println("");
	}

	// exercise 1
	static public String replaceLetterInTextWords(String text, int k) {

		String[] newText = text.split(" ");

		String textChanged = "";

		for (String t : newText) {
			String[] sw = t.split("");
			if (sw.length > k) {
				sw[k - 1] = "!";
			}
			String join = String.join("", sw);
			textChanged = textChanged + " " + join;
		}

		// if (t.length() <= k) {
		// textChanged = textChanged + " " + t;
		// } else {
		//// TODO why in mainstream change 2 letters
		// textChanged = textChanged + " " + t.replace(t.charAt(k), '!');
		// }

		return textChanged.trim();
	}

	// exercise 2
	private static void printEveryCharInArray(char[] arrayCh) {
		for (int i = 0; i < arrayCh.length; i++) {
			System.out.print(arrayCh[i] + "  ");
		}
		System.out.println("");
	}

	private static void printEveryCharAlphabetNumber(char[] arrayCh) {
		int num = 0;
		for (int i = 0; i < arrayCh.length; i++) {
			num = getLetterAlphabetNumber(arrayCh[i]);
			if (num > 9) {
				System.out.print(num + " ");
			} else {
				System.out.print(num + "  ");
			}
		}
		System.out.println("");
	}

	private static char[] splitTextOnLetters(String text) {
		String[] splitString = text.split(" ");
		String[] arrayString = null;
		char[] newArrayChar = null;
		String newString = "";
		for (String str : splitString) {
			arrayString = str.split("");
			for (int i = 0; i < arrayString.length; i++) {
				newString = newString + arrayString[i];
			}
		}
		newArrayChar = newString.toCharArray();
		return newArrayChar;
	}

	private static int getLetterAlphabetNumber(char ch) {
		int letterNum = 0;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		letterNum = alphabet.indexOf(ch) + 1;
		return letterNum;
	}

	// exercise 2
	static public String replaceLetterAlphabetNumber(String text, int k) {

		String[] newText = text.split(" ");

		String textChanged = "";

		for (String t : newText) {
			String[] sw = t.split("");
			if (sw.length > k) {
				sw[k - 1] = "!";
			}
			String join = String.join("", sw);
			textChanged = textChanged + " " + join;
		}

		// if (t.length() <= k) {
		// textChanged = textChanged + " " + t;
		// } else {
		//// TODO why in mainstream change 2 letters
		// textChanged = textChanged + " " + t.replace(t.charAt(k), '!');
		// }

		return textChanged.trim();
	}

	// exercise 8
	static public String removeLetterBetweenSymbols(String text, char c) {
		String newText = text.replaceAll("(?<=\\*)(.*)(?=\\*)", "");
		return newText;
	}

	// exercise 9
	private static void printWordsPepeats(String text) {
		String[] arrString = splitTextOnWords(text);
		int repeats = 0;

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < arrString.length; i++) {
			repeats = returnNumberWordRepeats(arrString, arrString[i]);
			System.out.println(arrString[i] + " " + repeats);
		}
	}

	private static String[] splitTextOnWords(String text) {
		String[] splitString = text.split(" ");
		return splitString;
	}

	private static int returnNumberWordRepeats(String[] arrString, String word) {
		int counter = 0;
		for (int i = 0; i < arrString.length; i++) {
			if (word.equals(arrString[i])) {
				counter++;
			}
		}
		return counter;
	}

}
