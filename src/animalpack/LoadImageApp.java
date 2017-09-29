/*
 * Loads the images of object in the Images folder at the given path only 
 */

package animalpack;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class LoadImageApp extends JPanel{
    //Default variable 
	private static final long serialVersionUID = 1L;
    private BufferedImage image;
    
//******************CONSTRUCTORS*************************************************************************** 
    public LoadImageApp() {
    		System.out.print( "===================\r"
    				+"ERROR:\n"
    				+ "***NO IMAGE loaded\r"
    				+ "***Add an animal object\r");
    }
    
    public LoadImageApp(String name){
    	
        //Sets a minimum size for each image
    		setMinimumSize(new Dimension(400,400));
        
        //sets name to a capitolized letter to match the image name
        //In the file 
        String name2 = name.toUpperCase(); 
        
        //If an exception occurs one of the variables will become false
        boolean try1 = true; 
        boolean try2 = true;
        boolean try3 = true;
        
        /*
         * To use this class method: 
         * Change the file path from "/Volumes/Docs_Apps/Images/" to the local folder where your images are stored.
         * The image names must be capitolized in the files in order for this program to run.
         * This feature can be altered by make your image names all lower case and swapping 
         * the name.toUpperCase() to name.toLowerCase() above.  
         */
        try {
            image = ImageIO.read(new File("/Volumes/Docs_Apps/Images/"+ name2 +".PNG"));
        } catch (IOException e) {
        		try1 = false; 
        		try { 
                image = ImageIO.read(new File("/Volumes/Docs_Apps/Images/"+ name2 +".jpeg"));
            } catch (IOException f) {
            	try2 = false;
            		try {
            			image = ImageIO.read(new File("/Volumes/Docs_Apps/Images/"+ name2 +".jpg"));
            			} catch (IOException g) {
            				try3 = false;
            		}//END OF THIRD CATCH BLOCK FOR "JPG" IMAGES
            		
            }//END OF SECOND CATCH BLOCK FOR "JPEG" IMAGES
        		
        }//END OF FIRST CATCH BLOCK FOR "PNG" IMAGES
        
        if(!try1 && !try2 && !try3) {
        		System.out.println("No image type found.");
        }
        
    }//END OF LOAD IMAGE
    
//****************************METHODS*****************************************************************    
    //Sets a fixed width for the image loaded
    public int getFixedWidth() {
    	
    		/*horizontal image
    		500 - 700 width*/ 
    		int precisionWidth = (int) Math.round(image.getWidth()/1.6);
    		
    		/*vertical image 
    		500 - 700 width*/ 
    		int precisionWidth1 = (int) Math.round(image.getWidth()/1.7);
    		//701 - 1200 width
    		int precisionWidth2 = (int) Math.round(image.getWidth()/2.6);
    		//1201 - 2000 width
    		int precisionWidth3 = (int) Math.round(image.getWidth()/3);
    		
    		//CHECK IF IMAGE IS HORIZONTAL OR VERTICAL
    		if(image.getWidth() > image.getHeight()) {
	    		
    			//HORIZONTAL IMAGE : WIDTH METHOD
	    		if(image.getWidth() < 500) {
		    		return image.getWidth(); 
		    		}else if(image.getWidth() > 500 && image.getWidth() < 1000) {
		    			return precisionWidth;
	    			}else if(image.getWidth() > 1000 && image.getWidth() < 1500){
		    			return image.getWidth()/2;
		    		}else if(image.getWidth() > 1500 && image.getHeight() < 2000){
		    			return image.getWidth()/3;
		    		}else {
		    			return image.getWidth()/9;
		    	}
    		}else {
    			//VERTICAL IMAGE : WIDTH METHOD
    			if(image.getWidth() < 500){
    					return image.getWidth(); 
    				}else if(image.getWidth() > 500 && image.getWidth() < 730) {
    					return precisionWidth1;
			    	}else if(image.getWidth() > 730 && image.getWidth() < 1200){
			    		return precisionWidth2;
			    	}else if(image.getWidth() > 1200 && image.getWidth() < 2000){
			    		return precisionWidth3;
			    	}else {
			    		return image.getWidth()/9;
			    	}
    		}
    }//END OF getFixedWidth()
    
 //*********************************************************************************************    
    //Sets a fixed width for the image loaded 
    public int getFixedHeight() {
    		
    		//500 - 800 Height
    		int precisionHeight = (int) Math.round(image.getHeight()/1.6);
    		//800 - 1500 Height
    		int precisionHeight2 = (int) Math.round(image.getHeight()/2);
    		//1500 - 2000 Height
    		int precisionHeight3 = (int) Math.round(image.getHeight()/2.75);
    		
    		//CHECK IF IMAGE IS HORIZONTAL OR VERTICAL
    		if(image.getWidth() > image.getHeight()) {
    		//HORIZONTAL : HEIGHT METHOD
		    	if(image.getHeight() < 500) {
		    		return image.getHeight();
			    	}else if(image.getHeight() > 500 && image.getHeight() < 800) {
			    		return precisionHeight;
		    		}else if(image.getHeight() > 800 && image.getHeight() < 1500){
			    		return image.getHeight()/2;
			    	}else if(image.getHeight() > 1500 && image.getHeight() < 2000){
			    		return image.getHeight()/3;
			    	}else {
			    		return image.getHeight()/7;
			    	}
    			}else {
    		//VERTICAL IMAGE : HEIGHT METHOD
    			if(image.getHeight() < 500) {
    				return image.getHeight(); 
    				}else if(image.getHeight() > 500 && image.getHeight() < 800) {
		    			return precisionHeight;
			    	}else if(image.getHeight() > 800 && image.getHeight() < 1200){
			    		return precisionHeight2;
			    	}else if(image.getHeight() > 1200 && image.getHeight() < 2000){
			    		return precisionHeight3; 
			    	}else {
			    		return image.getHeight()/9;
			    	}
    		}
    }//END OF getFixedHeight()
    
//*********************************************************************************************     
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
                                //Paint it on screen
        g2d.drawImage(image, 0, 0, getFixedWidth(), getFixedHeight(), null);
        g2d.dispose();
    }
}

