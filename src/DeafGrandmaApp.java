
import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeafGrandmaApp  app = new DeafGrandmaApp();
		app.launch();
		
	}
	
	private void launch() {
		
		Scanner kbinput = new Scanner(System.in);
		
		//Get the question from the silly relative.
	
		System.out.println("What do you want to say to grandma?");
		String quesforGrandma = kbinput.nextLine();
		kbinput.nextLine();
		
		//instantiate grandma
		// call grandma method here
		
		// test call to grandma
		grandma();
		
		// close scanner and exit
		kbinput.close();
		// all the login is going in here
		
	}

}
