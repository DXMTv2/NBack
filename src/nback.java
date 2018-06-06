import java.util.Scanner;
public class nback {

	
	public static int ans=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		boolean play=true;
		while (play) {
			calculations c = new calculations();
			//Int and Strings
			int score = 0;
			int level = 1;
			int numberOfQuestions = 5;
			String RestartChoice = "";
			//Body
			System.out.println("Choose a level:");
			System.out.println("1. easy\n2. Medium\n3. Hard");
			level = in.nextInt();
			int prev = 1;
			if (level == 1) {
				prev = 1;
			} else if (level == 2) {
				prev = 2;

			} else if (level == 3) {
				prev = 4;
			}
			int[] prevAns = new int[prev];// an arrays that stores the previous answers
			System.out.println("Answer each question");
			for (int i = 0; i < prev; i++) {
				c.getQuestion();
				ans = c.getAns();
				prevAns[i] = ans;
			}
			for (int x = 1; x <= numberOfQuestions; x++) {
				System.out.print("Question " + x + ": ");
				c.getQuestion();

				int response = in.nextInt();
				score = score + c.checkAnswer(response, prevAns[0]);
				ans = c.getAns();

				for (int i = 0; i < prev - 1; i++) {
					prevAns[i] = prevAns[i + 1];
				}
				prevAns[prev - 1] = ans;
			}
			System.out.println("You got " + score + " out of " + numberOfQuestions);
			System.out.println("LOADING . . . 0%");
			System.out.println("LOADING . . . 10%");
			System.out.println("LOADING . . . 15%");
			System.out.println("LOADING . . . 27%");
			System.out.println("LOADING . . . 41%");
			System.out.println("LOADING . . . 50%");
			System.out.println("LOADING . . . 78%");
			System.out.println("LOADING . . . 100%");
			System.out.println("Would you like to restart? Yes or No?");
			in.nextLine();
			RestartChoice = in.nextLine();
			if (RestartChoice.equals("Yes")) {
				System.out.println("Please click PLAY.");
				System.out.println("game continues");
			} else if (RestartChoice.equals("No")) {
				System.out.println("Return back when your ready.");
				play=false;
			} 
		}
		System.out.println("byebye");
	}
	

}