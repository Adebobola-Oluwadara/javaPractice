package javatasks;

import java.util.Scanner;
public class Hypothenus {

	public static void main(String[] args) {
		System.out.println("Enter a value for x: ");
		Scanner obj = new Scanner (System.in);
		Double x = obj.nextDouble();
		System.out.println("Enter a value for y: ");
		Double y = obj.nextDouble ();
        double z = Math.sqrt((x*x) + (y*y));
        System.out.println(z);
        obj.close();
	}

}
