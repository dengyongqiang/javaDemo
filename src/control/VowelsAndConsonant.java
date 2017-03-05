package control;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

import java.util.*;

public class VowelsAndConsonant {

	public static void main(String[] args) {
		Random rand = new Random(47);
		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt(26) + 'a';
			printnb((char) c + ", " + c + ": ");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				print("vowel");
				break;
			case 'y':
			case 'w':
				print("Sometimes a vowel");
				break;
			default:
				print("consonant");
			}
		}
	}

}
