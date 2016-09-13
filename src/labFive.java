import java.util.Random;
import java.util.Scanner;

public class labFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Greetings and user input
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("Roll the dice?");
		Scanner input1 = new Scanner(System.in);
		String inputContinue = input1.nextLine();
		boolean rollMe;
		if(inputContinue.equalsIgnoreCase("y")){
			rollMe = true;
			
		} else {
			rollMe = false;
			System.out.println("Ok bye!");
		}
		// Ask user to enter number of sides
		System.out.println("Please enter an integer to begin.");
		
		// read user input
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		//Roll dice
		Random randomNum = new Random();
		System.out.println(randomNum.nextInt(12));
		
		

	}

	

}
