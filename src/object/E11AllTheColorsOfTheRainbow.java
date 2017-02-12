package object;

public class E11AllTheColorsOfTheRainbow {

	public static void main(String[] args) {
		AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
		System.out.println(allTheColorsOfTheRainbow.anIntegerRepresentingColors);
		allTheColorsOfTheRainbow.changeColor(7);
		allTheColorsOfTheRainbow.changeTheHueOfTheColor(77);
		System.out.println(allTheColorsOfTheRainbow.anIntegerRepresentingColors);
		System.out.println(allTheColorsOfTheRainbow.hue);
	}

}

class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors = 0;
	int hue = 0;

	void changeTheHueOfTheColor(int newHue) {
		hue = newHue;
	}

	int changeColor(int newColor) {
		return anIntegerRepresentingColors = newColor;
	}
}