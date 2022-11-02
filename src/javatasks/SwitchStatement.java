package javatasks;
public class SwitchStatement {

	public static void main(String[] args) {
		String familyMembers = "DA";
		switch (familyMembers.toLowerCase()){
		case "dara" :
			System.out.println("Dara is the first child");
			break;
		case "fumbi" :
			System.out.println("Fumbi is the second child");
			break;	
		case "oba" :
			System.out.println("Oba is the third child");
			break;
		default :
			System.out.println("Enter a valid name");
		break;		
		}
		
		
		}
	}

