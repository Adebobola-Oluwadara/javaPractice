package javatasks;

public class StringFormatting {

	public static void main(String[] args) {
		
		String name = "oluwadara";
		String name2 = "update";
		int age = 21;
		System.out.format("Your name is %s! \nYou are %d years old.", name, age);
		//System.out.println(identity);
		
		System.out.println();
		System.out.println("\"Dara\"");
		
		//%n creates a new line as well and it is most preferred to \n
		 int i = 2;
	     double r = Math.sqrt(i);
	     System.out.format("The square root of %d is %f %n", i, r);
	     
	    
	     System.out.format("%f, %1$+020.11f %n", Math.PI);
	     
	     
	     System.out.println("I want to create\nanother line");
	     
	     System.out.println("I want to create %n another line");
	     
	     // %n creates another line when used with a format method
	     System.out.format("I want to create%nanother line%n");
	     
	     //argument indexing with format method %n$... 
	     String a= "a", b= "b", c= "c", d= "d", e= "e", f= "f", g= "g" ;
	     System.out.format("%1$s, %6$s, %4$s, %3$s", a, b, c, d, e, f, g);
	     
	     //case changing with format method
	     System.out.format("%n%S", "oluwadara");
	     
	     //width changing with format method
	     System.out.format("%n%15S", "oluwadara");
	     System.out.format("%n'%-15S'", "oluwadara");
	     
	     //character limitation with format method %x.y...
	     System.out.printf("%n%2.5s", "Hi there!");
	     
	   
	}

}
