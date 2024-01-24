import java.awt.Color;


public class Editor4 {

	public static void main(String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] greyScaled = Runigram.grayScaled(sourceImage);

		// Set the canvas before morphing
		Runigram.setCanvas(sourceImage);

		// Morph the image into its grayscale version
		Runigram.morph(sourceImage, greyScaled, n);
	}
}