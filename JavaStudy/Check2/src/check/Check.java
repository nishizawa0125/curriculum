package check;

import constants.Constants;

public class Check{
	
	public static void main(String[] args) {
		String firstName = "西澤";
		String lastName = "和陽";
		System.out.println("printNameメソッド → " + printName(firstName, lastName));
		
		Pet p = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		p.introduce();
		
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rp.introduce();

		

	}

	private static String printName(String a, String b) {
		return a + b;
	}
	
	
}
