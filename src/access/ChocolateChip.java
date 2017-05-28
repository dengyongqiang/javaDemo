package access;

import access.dessert.Cookie;

public class ChocolateChip extends Cookie {

	public ChocolateChip() {
		System.out.println("ChocolateChip Constructor");
	}

	public void chomp() {
		// bite();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChocolateChip x = new ChocolateChip();
		x.chomp();
	}

}
