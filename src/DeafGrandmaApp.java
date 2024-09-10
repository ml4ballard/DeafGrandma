
import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {
		
		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();

	}

	private void launch() {

		Scanner kbinput = new Scanner(System.in);
			
		System.out.println("What do you want to say to grandma?");
		String kidresponse = kbinput.nextLine();

		// instantiate grandma
		
		Grandma gmother = new Grandma();
		
		// call grandma method here

		// test call to grandma		

		gmother.getResponse(kidresponse);

		// close scanner 
		kbinput.close();


	}

}
