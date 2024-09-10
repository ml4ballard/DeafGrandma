
import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();

	}

	private void launch() {

		Scanner kbinput = new Scanner(System.in);
			
		System.out.println("What do you want to say to grandma?");
		kbinput.nextLine();

		// instantiate grandma
		
		class Grandma {
			String question;
			String response;
			
		}
		
		Grandma gmother = new Grandma();
		
		// call grandma method here

		// test call to grandma
		
		String response = Grandma();

		// close scanner and exit
		kbinput.close();
		// all the login is going in here

	}

}
