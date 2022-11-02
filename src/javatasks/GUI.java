package javatasks;
import javax.swing.JOptionPane;

public class GUI {
	public static void main(String[] args) {
		String name1 = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + name1 + " I just want to tell you that YOU ARE THE BEST");
		
		
		int age = Integer.parseInt (JOptionPane.showInputDialog  ("How old are you? lol"));
		JOptionPane.showMessageDialog(null, "You are a young man and you shall"
				+ " live long better than the " + age + " years you have spent!");
		
		String name2 = JOptionPane.showInputDialog("Make a wish?");
		JOptionPane.showMessageDialog(null, "From your mouth to God's ears");
	}

}
