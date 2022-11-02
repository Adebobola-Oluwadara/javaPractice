package javatasks;
public class ComparingDoubles {

	public static void main(String[] args) {
		double r = Math.sqrt(2.0);
        
        //You would expect r*r==2
        System.out.println(r*r);
       
        //And this would be true
        System.out.println(r*r == 2);
       
        //But neither is true
       
        //And this is the right way.  it checks to see if 
        the two values are within 1E-14 (10-14, or 0.00000000000001) of each other.
        final double EPSILON = 1E-14;
       
        //And this *is* true
        System.out.println(Math.abs(r*r - 2.0) < EPSILON);
	}

}
