package object;

public class E07Incrementable {
	static int i = 47;

	static void increment() {
		E07Incrementable.i++;
	}
	
	public static void main(String[] args) {
		E07Incrementable.increment();
		System.out.println(E07Incrementable.i);
	}

}
