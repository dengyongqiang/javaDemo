package initialization;

import static net.mindview.util.Print.*;

import java.util.*;

public class ArrayNew {

	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		print("length of a = " + a.length);
		print(Arrays.toString(a));
	}

}
