package animalpack;

import java.awt.Dimension;
import javax.swing.JFrame;


public class ImagePrint {

	public static void imagePrint() {
		@SuppressWarnings("unused")
		LoadImageApp image = new LoadImageApp();  
	}
	public static void imagePrint(Animal obj) {
		LoadImageApp image = new LoadImageApp(obj.getName()); 
		JFrame window = new JFrame(obj.getName());
	    window.add(new LoadImageApp(obj.getName()));
	    window.setLocationRelativeTo(null);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setPreferredSize(new Dimension(image.getFixedWidth(), image.getFixedHeight()));
	    window.pack();
	    window.setVisible(true);
	}
}
