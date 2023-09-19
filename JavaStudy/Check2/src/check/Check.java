package check;

import constants.Constants;
import check.Pet;

public class Check {
	public static void main(String[] args) {
		String firstName = "西澤";
		String lastName = "和陽";
		System.out.println("printNameメソッド → " + printName(firstName, lastName));
	}

	private static String printName(String a, String b) {
		return a + b;
	}
}

class Constants {
	public void introduce() {
		RobotPet Pet = new RobotPet();
		Pet.introduce();
	}
		
}

class Pet {
	public void introduce() {
		System.out.println();
	}
}

class RobotPet {
	public void introduce() {
		System.out.println();

	}
}
