package object;

public class E04DataOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class DataOnly {
			int i;
			double d;
			boolean b;
			public void show(){
				System.out.println(i);
				System.out.println(d);
				System.out.println(b);
			}
		}
		DataOnly dataOnly = new DataOnly();
		dataOnly.i = 47;
		dataOnly.d = 1.1;
		dataOnly.b = false;
		dataOnly.show();
	}

}
