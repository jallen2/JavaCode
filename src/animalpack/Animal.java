/*
 * Super Class to the Dog and Horse Subclasses 
 * Creates a Default Animal.
 *  
 */

package animalpack;

public class Animal {
	//Animal data
	private String name = "Animal"; 
	private double height = 0; 
	private double weightLbs = 0; 
	private String color = "Some Color"; 
	private String sound = "grrrr";
	private String description;
	
	//Animal MetaData
	private static int count = 0;
	private String measurement; 
	
	public Animal() {
		count++; 
	}//END OF EMPTY CONSTRUCTOR 
	
	public Animal(String name, String sound, String measurement) {
		count++; 
		this.name = name; 
		this.sound = sound;
		this.measurement = measurement; 
		description = "This animal is (a/an) " + name + ".\rAnd it says " + sound + "!"; 
	}//END OF CONSTRCUTOR 2
	
	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name; 
	}
	//COUNT
	public static void getCount() {
		System.out.println("There are " + count + " animals created so far.");
	}
	
	//HEIGHT
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//WEIGHT
	public double getWeightLbs() {
		return weightLbs;
	}
	public void setWeightLbs(double weightLbs) {
		this.weightLbs = weightLbs;
	}
	//COLOR
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}//END OF SETCOLOR
	
	//DESCRIPTION
	public String getDescription() {
		description = "You have created (a/an) " + name + " that is " + height
				+ " \n" + measurement + " tall weighing " + weightLbs + " pounds \nand is " + 
				color + " and it says " + sound + ".\n";
		return description;
	}
	
	//SOUND
	public void getSound() {
		System.out.println(sound + "!!!");
	}
	
	//PRINT 
	@Override 
	public String toString() {
		return getDescription(); 
	} 
	
}//END OF ANIMAL CLASS
