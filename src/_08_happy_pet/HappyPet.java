package _08_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static int food = 5;
static int water = 5;
static int happy = 5;
static String PetType; 
	public static void main(String[] args) {
	
	// 1. Ask the user what kind of pet they want to buy, and store their answer in
	// a variable
	PetType = JOptionPane.showInputDialog("What kind of pet do you want?");
	// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

	// 3. Use showOptionDialog to ask the user what they want to do to make their
	// pet happy
	// (eg: cuddle, food, water, take a walk, groom, clean up poop).
	// Make sure to customize the title and question too.
	while(happy < 20) {
		happy = happy - 1;
		food = food - 1;
		water = water - 1;           
	int task = JOptionPane.showOptionDialog(null, "What would you like to do with your "+ PetType + "?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Give Food", "Give Water" }, null);
//			int task2 = JOptionPane.showOptionDialog(null, "Question", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
//					new String[] { "Button1", "Button2", "Button3" }, null);

	// 5. Use user input to call the appropriate method created in step 4.

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.
	if(task == 0){
	cuddlePet();
		}
	
	if(task == 1) {
	feedPet();
	}
	
	if(task == 2) {
	waterPet(); 
	}
 if(food == 0) {
		JOptionPane.showMessageDialog(null, "Your pet was underfed! Your pet " + PetType + " died!");
		System.exit(0); 
 }
if(water == 0) {
	JOptionPane.showMessageDialog(null, "Your pet was too dehydrated! Your pet " + PetType + " died!");
System.exit(0); 
}
if(happy == 0) {
	JOptionPane.showMessageDialog(null, "Your pet is super depressed and died of sadness.");
	System.exit(0); 
}
if(food == 5 || water == 5) {
	happy = happy + 2;
}
	}
	}
	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	
	
	static void cuddlePet() {
		if (PetType.equalsIgnoreCase("Cat") || PetType.equalsIgnoreCase("Dog") || PetType.equalsIgnoreCase("Turtle")|| PetType.equalsIgnoreCase("Hamster")) {
			happy = happy + 5;
		}
		else {
			happy = happy - 1;
		}
	}
	static void feedPet() {
		food = food + 3;
}
	static void waterPet() {
		water = water + 3;
	}
	}
	