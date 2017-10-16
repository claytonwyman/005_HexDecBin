
import javax.swing.JOptionPane;

public class RunHere {

	public static void main(String[] args) {
			
			String msg = "";
			Boolean runAgain = false;
			String goAgain = "No";
			
			BinPower binpower = new BinPower();
			binpower.setBinary();
			
			HexDecBin baseConverter = new HexDecBin();
			baseConverter.setHexNumber();
			baseConverter.convert();
			
			msg = "Do you want to go again, Y/N?";
			goAgain = JOptionPane.showInputDialog(msg);

			if (goAgain.equalsIgnoreCase("y")) {
				System.out.println("Selection is Y or y");
				runAgain = true;
			} else if (goAgain.equalsIgnoreCase("n")) {
				System.out.println("Selection is either N or n");
				runAgain = false;
			} else if (goAgain.equalsIgnoreCase("yes")) {
				System.out.println("Selection is either Yes or yes or YES");
				runAgain = true;
			} else if (goAgain.equalsIgnoreCase("no")) {
				System.out.println("Selection is either No or no or NO");
				runAgain = false;
			} else {
				System.out.println("Sorry, I don't understand your input, please try again");
				runAgain = false;
			}
		
	}
	

}
