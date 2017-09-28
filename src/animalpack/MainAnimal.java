package animalpack;

public class MainAnimal {

	public static void main(String[] args) {

		Horse dakota = new Horse("Dakota"); 
		ImagePrint.imagePrint(dakota);
		
		Horse eclipse = new Horse("Eclipse"); 
		ImagePrint.imagePrint(eclipse);
		
		Horse thor = new Horse("Thor"); 
		ImagePrint.imagePrint(thor);
		
		Dog finn = new Dog("Finn");
		ImagePrint.imagePrint(finn);
		
		Dog staten = new Dog("Staten");
		ImagePrint.imagePrint(staten); 

	}

}
