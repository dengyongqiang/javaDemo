package object;

public class E06Storage {

	public static void main(String[] args) {
		String str = "ABCDEFG";
		int strLength = E06Storage.storage(str);
		System.out.println(strLength);
	}

	public static int storage(String s) {
		return s.length() * 2;
	}

}
