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
	private int age = 0; 
	private String description;
	
	//Animal MetaData 
	private static int count = 0;
	private String measurement;
	private int ID;
	
	public Animal() {
		count++;
		ID = count;
	}//END OF EMPTY CONSTRUCTOR 
	
	public Animal(String name, String sound, String measurement) {
		count++;
		ID = count;
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
	}
	//AGE
	public void setAge(int age) {
		this.age = age; 
	}
	public int getAge() {
		return this.age; 
	}
	
	
	//DESCRIPTION
	public String getDescription() {
		description = "You have created (a/an) " + name + " that is " + height
				+ " \n" + measurement + " tall weighing " + weightLbs + " pounds \nand is " + 
				color + " and it says " + sound + ". This " + name + " is " + age + " years old.\n";
		return description;
	}
	
	//SOUND
	public void getSound() {
		System.out.println(sound + "!!!");
	}
	
	public int getID() {
		 return ID; 
	}
	
	//PRINT 
	@Override 
	public String toString() {
		return getDescription(); 
	} 
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
	        return false;
	    }
	    if (!Animal.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final Animal other = (Animal) obj;
	    if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
	        return false;
	    }
	    if (this.age != other.age) {
	        return false;
	    }
	    if(this.getClass() != other.getClass()) {
	    		return false; 
	    }
	    if (this.ID != other.ID) {
    		return false; 
    }
	    return true; 
	}
	
}//END OF ANIMAL CLASS
