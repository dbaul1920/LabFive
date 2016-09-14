import java.util.Random;
import java.util.Scanner;

public class labFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Greetings and user input
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println("Try your luck with the dice? (Enter Y or N)");
		Scanner input1 = new Scanner(System.in);
		String inputContinue = input1.nextLine();
		boolean rollMe;
		if(inputContinue.equalsIgnoreCase("y")){
			rollMe = true;
			
		} else {
			rollMe = false;
			System.out.println("Ok bye!");
		}
boolean userContinue=true;
while(userContinue){
		// Ask user to enter number of sides
		System.out.println("How many sides does your dice have? (Enter a whole number)");
		
		// read user input
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		//Roll dice
		Random randomNum = new Random();
		//Print out a random number between 1 and 12
		System.out.println("You rolled a " + (randomNum.nextInt(12)+1));
		
		// add continue loop
		
		System.out.println("Roll agian? (Enter Y or N)");
		Scanner input2 = new Scanner(System.in);
		String inputContinue1 = input2.nextLine();
		if(inputContinue1.equalsIgnoreCase("y")){
			userContinue = true;
		} else {
			userContinue = false;
			System.out.println("Ok bye!");
		}
	}//close while loop
	}

	

}
