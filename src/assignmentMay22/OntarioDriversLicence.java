package assignmentMay22;

public class OntarioDriversLicence {

	public static void main(String[] args) {

		int ageOfCandidate = 100;
		int mininumAge = 16;
		String currentlicence = "G1";

		if (ageOfCandidate < mininumAge) {
			System.out.println("Candidate not old enough to get drivers licence");
		} else if (currentlicence == "none") {
			System.out.println("Candidate eligible for G1 licence and not eligible for G2 or G");
		} else if (currentlicence == "G1") {
			System.out.println("Candidate eligible for G2 and not eligible for G");
		} else if (currentlicence == "G2") {
			System.out.println("Candidate elgible for G");
		}

	}

}
