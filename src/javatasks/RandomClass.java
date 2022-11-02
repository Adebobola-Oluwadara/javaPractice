package javatasks;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		Random random = new Random ();
		
		//added 1 because there is no day and month 0
		int weddingdate = random.nextInt(31)+1;
		int weddingmonth = random.nextInt(13)+1;
		System.out.println ("Your wedding will hold on the ");
		System.out.println ("Date: " + weddingdate);
		System.out.println("Month: " + weddingmonth);
		
	}

}
