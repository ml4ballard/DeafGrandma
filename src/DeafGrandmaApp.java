
import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {

		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();

	}

	private void launch() {

		Scanner kbinput = new Scanner(System.in);

//  grandma and initialize with responses, new grandma

		Grandma gmother = new Grandma();

// Initialize all of the grandma responses 
		gmother.shoutArr[0] = "YOU LOOK GREAT";
		gmother.shoutArr[1] = "I LIKE YOUR BROTHER BETTER";
		gmother.shoutArr[2] = "USE THIS CREAM";

		gmother.respArr[0] = "CAN I BORROW MONEY";
		gmother.respArr[1] = "LETS RUN AWAY";
		gmother.respArr[2] = "SHUT UP AND GET IN THE TRUCK";
		
		gmother.byeArr[0] = "SMELL YOU LATER";
		gmother.byeArr[1] = "GLAD THIS IS OVER";
		gmother.byeArr[2] = "DONT LET THE DOOR HIT YOU WHERE THE GOOD LORD SPLIT YOU";
		
		String kidResponse = " ";

// Get user input and chat with grandma
//		System.out.println("Kid response is" + kidResponse);
			
	
	while ( !kidResponse.equals("GOODBYE") ) {
	
		System.out.println("What do you want to say to grandma?");
		kidResponse = kbinput.nextLine();
		
//		System.out.println("Kid response is" + kidResponse);
		String kidUpper = kidResponse.toUpperCase();
//		System.out.println("Kid upper is" + kidUpper);
		
		if ( (kidResponse.toUpperCase()).equals("GOODBYE")) {
			int randomNum = ComputerRandom();
			System.out.println(gmother.byeArr[randomNum]);
			System.out.println();
		}		
		else if ( (kidResponse.toUpperCase()).equals(kidResponse)) {
			int randomNum = ComputerRandom();
			System.out.println(gmother.shoutArr[randomNum]);
			System.out.println();
		}
		else if ( !(kidResponse.toUpperCase()).equals(kidResponse)) {
			int randomNum = ComputerRandom();
			System.out.println(gmother.respArr[randomNum]);
			System.out.println();
		}
    } 
		// close scanner
		kbinput.close();

	}
	
	public int ComputerRandom() {
		int max = 2;
		int min = 0;
		int randomNum = min + (int)(Math.random() * ((max - min) + 1));
    	return randomNum;
	}

}
