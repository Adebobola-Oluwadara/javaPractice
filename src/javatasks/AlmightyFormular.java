package javatasks;
import java.util.Scanner;

public class AlmightyFormular {

	public static void main(String[] args) {
		
		//calculate the almighty formula
		
		System.out.println("Input a: ");
		Scanner obj1 = new Scanner (System.in);
		Double a = obj1.nextDouble();
		System.out.println("Input b: ");
		Double b = obj1.nextDouble();
		System.out.println("Input c: ");
		Double c = obj1.nextDouble();
		
		double v = b*b;
		double w = 4*a*c;
		double x = v - w;
		double x1 = v + w;
		double y = Math.sqrt(x);
		double y1 = Math.sqrt(y);
		double z = (y / (2*a));
		double s =  (y1 / (2*a));
		System.out.println(z);
		System.out.println(s);
	}

}
