package animalpack;

import java.util.Scanner; 

public class Horse extends Animal implements Moveable{

	private Scanner input = new Scanner(System.in);
	private static int horseCount = 0;
	private boolean value;
 
	
	public Horse() {
		super("Horse","Neigh","hands");
		setName("Horse");  
		horseCount++; 
		System.out.println("A new Horse has been created.");
	}//END OF CONSTRUCTOR 1
	
	public Horse(String name) {
		super("Horse","Neigh","hands");
		horseCount++; 
		setName(name);  
		System.out.println("A horse named "+ name + " has been created.");
	}//END OF CONSTUCTOR 2
	
	public Horse(boolean value) {
		super("Horse","Neigh","hands");
		horseCount++; 
		setName("Horse"); 
		this.value = value; 
		if(this.value == true) {
			System.out.println("A new Horse has been created.");
		}
	}//END OF CONSTRUCTOR 3
	
	public Horse(String name, int age) {
		super("Horse","Neigh","hands");
		horseCount++; 
		setName(name);  
		setAge(age); 
		System.out.println("A horse named "+ name + " has been created.");
	}//END OF CONSTUCTOR 4
	
	public Horse(String name, int age, boolean value) {
		super("Horse","Neigh","hands");
		horseCount++; 
		setName(name);
		setAge(age);
		this.value = value; 
		if(this.value == true) {
			System.out.println("A new horse has been created.");
		}
	}//END OF CONSTUCTOR 5
	public Horse(String name, boolean value) {
		super("Horse","Neigh","hands");
		horseCount++; 
		setName(name); 
		this.value = value; 
		if(this.value == true) {
			System.out.println("A new Horse has been created.");
		}
	}//CONSTRUCTOR 6
	
	public void setName(String name) {
		super.setName(name); 
	}//END OF SET NAME
	
	public String getName() {
		return super.getName(); 
	}//END OF GET NAME
	
	public void setAge(int age) {
		super.setAge(age); 
	}//END OF SET AGE
	
	public int getAge() {
		return super.getAge(); 
	}//END OF GET AGE
	
	public void addHorseSpecs() {
		System.out.print("Whats this Horses name?\rHorse name: ");
		this.setName(input.nextLine());
		
		System.out.print("How tall is this Horse in hands?\rHorse height: ");
		double height = input.nextDouble();
		this.setHeight(height);
		
		System.out.print("How much does this Horse weight in pounds?\rHorse weight: ");
		double weight = input.nextDouble();
		this.setWeightLbs(weight);
		input.nextLine(); 
		System.out.print("What color is this Horse?\rHorse color: ");
		String color = input.nextLine();
		this.setColor(color);
		
		System.out.println("\nThank you for that information!");
		System.out.println("Processing...");
		System.out.println("\nOK, according to the records provided.");
		System.out.println(this.toString());
	}//END OF ADD SPECS
	
	public void numberOfHorses() {
		System.out.println("There are " + horseCount + " horses.");
	}//END OF NUMBER OF HORSES
	
	public static void getCount() {
		if(horseCount > 1) {
			System.out.println("There are " + horseCount + " horses created so far.");
		}else if(horseCount == 0) {
			System.out.println("There are currently no horses created.");
		}else {
			System.out.println("There is 1 horse created so far.");
		}
	}//END OF GET COUNT
	
	public void exercise() {
		System.out.println("You rode your horse.");
	}//END OF EXERCISE INTERPHASE IMPLEMENTATION

	
}//END OF HORSE CLASS
