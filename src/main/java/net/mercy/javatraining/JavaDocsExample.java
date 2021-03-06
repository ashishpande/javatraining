package net.mercy.javatraining;

import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

public class JavaDocsExample {
	
	
	/**
	 * Returns an Image object that can then be painted on the screen. 
	 * The url argument must specify an absolute {@link URL}. The name
	 * argument is a specifier that is relative to the url argument. 
	 * <p>
	 * This method always returns immediately, whether or not the 
	 * image exists. When this applet attempts to draw the image on
	 * the screen, the data will be loaded. The graphics primitives 
	 * that draw the image will incrementally paint on the screen. 
	 *
	 * @param  url  an absolute URL giving the base location of the image
	 * @param  name the location of the image, relative to the url argument
	 * @return      the image at the specified URL
	 * @see         Image
	 */
	 public Image getImage(URL url, String name) {
	        try {
	            return getImage(new URL(url, name), name);
	        } catch (MalformedURLException e) {
	            return null;
	        }
	 }
	 

/**
 * Returns an Integer for the distance between two points. 
 * <p>
 * This method computes the distance based on two inputs that are {@link Integer}s. 
 * @param startLocation the point where we start measuring
 * @param endLocation the destination 
 * @return
 */
	 
	 
	 public Integer getDistance(String startLocation,String endLocation){
		 
		 int start = Integer.getInteger(startLocation);
		 int end = Integer.getInteger(endLocation);
		 Integer distance = end - start;		 
		 return distance; 
		 
	 }
	

}
