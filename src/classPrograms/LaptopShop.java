package classPrograms;

public class LaptopShop {

	public static void main(String[] args) {
		// Step 1 : Initialize all variables using object
//		Step 2 : Create a method to initialize all variables	
//		Step 3 : initialize all the variables using parameterized constructor
//		All the 3 steps to be depicted using 3 different objects.

		//Step1
		Laptop laptop1 = new Laptop();
		laptop1.laptopName = "Dell Inspiron";
		laptop1.processorType = "i7 3rd Gen";
		laptop1.ramSize = 16;

		laptop1.specs();

		//Step2
		Laptop laptop2 = new Laptop();
		String name = "HP Envy";
		String processor = "i5 2nd Gen";
		int ram = 8;
		laptop2.addFeatures(name, processor, ram);
		
		//Step3
		

	}

}
