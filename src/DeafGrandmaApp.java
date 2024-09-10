
import java.util.Scanner;

public class DeafGrandmaApp {

	public static void main(String[] args) {

		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();

	}

	private void launch() {

		Scanner kbinput = new Scanner(System.in);

		// instantiate grandma and add values

		Grandma gmother = new Grandma();

//		Initialize all of the fields that for some reason are being kept in another file
		gmother.shoutArr[0] = "ONE shout response";
		gmother.shoutArr[1] = "TWO shout response";
		gmother.shoutArr[2] = "Three shout response";

		gmother.respArr[0] = "This really sucks";
//    	gmother.shout = "What is the point of this all over the place";

//		gmother.response[2]= "TWO This really sucks";
//		gmother.shout[2] = "TWO What is the point of this all over the place";	

		System.out.println("this will never work");
		System.out.println(gmother.shoutArr[0]);
//		System.out.println(gmother.shout[2]);

		System.out.println("What do you want to say to grandma?");
		String kidresponse = kbinput.nextLine();

		// call grandma method here

		// test call to grandma

//		gmother.getResponse(kidresponse);

		// close scanner
		kbinput.close();

	}

	public String getResponse(String kidresponse) {

		System.out.println("in grandma");
		System.out.println("Leaving grandma");

		String response = " ";
		return kidresponse;

	}

}
