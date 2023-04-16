package generic_Package;

import java.util.Random;

public class JavaUtility {

	public int getRandomNo()
	{
		Random ran=new Random();
		int random=ran.nextInt(500);
		return random;
	}

}
