package animalpack;

import java.util.Scanner;

public class Dog extends Animal implements Action{
	
	private Scanner input = new Scanner(System.in);
	private static int dogCount = 0; 
	private boolean value; 
	
	public Dog() {
		super("Dog","Bark","inches");
		dogCount++; 
		setName("Dog");  
		System.out.println("A new Dog has been created.");
	}//END OF CONSTUCTOR 1
	
	public Dog(String name) {
		super("Dog","Bark","inches");
		dogCount++; 
		setName(name);  
		System.out.println(name + " has been created.");
	}//END OF CONSTUCTOR 2
	
	public Dog(boolean value) {
		super("Dog","Bark","inches");
		dogCount++; 
		setName("Dog"); 
		this.value = value; 
		if(this.value == true) {
			System.out.println("A new Dog has been created.");
		}
	}//END OF CONSTUCTOR 3
	
	public void setName(String name) {
		super.setName(name); 
	}//END OF SET NAME
	
	public String getName() {
		return super.getName(); 
	}//END OF GET NAME 
	
	public void addDogSpecs() {
		System.out.print("Whats this dogs name?\rDog name: ");
		this.setName(input.nextLine());
		
		System.out.print("How tall is this dog in inches?\rDog height: ");
		double height = input.nextDouble();
		this.setHeight(height);
		
		System.out.print("How much does this dog weight in pounds?\rDog weight: ");
		double weight = input.nextDouble();
		this.setWeightLbs(weight);
		input.nextLine(); 
		System.out.print("What color is this dog?\rDog color: ");
		String color = input.nextLine();
		this.setColor(color);
		
		System.out.println("\nThank you for that information!");
		System.out.println("Processing...");
		System.out.println("\nOK, according to the records provided.");
		System.out.println(this.toString());
	}//END OF ADD SPECS
	public void numberOfDogs() {
		System.out.println("There are " + dogCount + " dogs.");
	}//END OF NUMBER OF DOGS 

	public static void getCount() {
		if(dogCount > 1) {
			System.out.println("There are " + dogCount + " dogs created so far.");
		}else if(dogCount == 0) {
			System.out.println("There are currently no dogs created.");
		}else {
			System.out.println("There is 1 dog created so far.");
		}
	}//END OF GET COUNT
	
	public void exercise() {
		System.out.println("You walked your dog.");
	}//END OF EXERCISE INTERPHASE IMPLEMENTATION
	
	
}//END OF DOG CLASS
