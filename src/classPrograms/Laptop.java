package classPrograms;

public class Laptop {
//Create a class laptop with variables laptopName, ramsize, processor type.

	String laptopName;
	int ramSize;
	String processorType;

	void specs() {
		System.out.println("The selected laptop is " + laptopName + " with " + processorType + " processor and "
				+ ramSize + "GB RAM");
	}

	void addFeatures(String name, String type, int size) {

		laptopName = name;
		ramSize = size;
		processorType = type;
		System.out.println("The selected laptop is " + laptopName + " with " + processorType + " processor and "
				+ ramSize + "GB RAM");
	}
}
