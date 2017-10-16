import java.util.Scanner;

import javax.swing.JOptionPane;

public class BinPower {

	Scanner input = new Scanner(System.in);
	
	public BinPower() {
		
	}
	
	public void setBinary() {
		double exp;
		double base;
		int ans = 0;
		double answer;
		String name = "";
		//ans = 2^exp;
		//System.out.println("Answer is: " + ans);
		
		System.out.println("Helo most amazing Java student! What is your name?");
		name = input.nextLine();
		System.out.println("Thanks for using my most awesome program " + name);
		
		System.out.println(name + " what base number do you want to enter?");
		base = input.nextDouble();
		System.out.println(name + " you have entered: " + base);
		
		System.out.println(name + " what binary exponent do you want to enter?");
		exp = input.nextDouble();
		System.out.println(name + " you have entered: " + exp);
		
		answer = Math.pow(base, exp);
		System.out.println("Answer is: " + answer);
	}
	
}
