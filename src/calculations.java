import java.util.Random;
public class calculations {

	Random rnd=new Random();
	private int num1;
	private int num2;
	public void getQuestion() {
		// TODO Auto-generated method stub
		num1=rnd.nextInt(10);
		num2=rnd.nextInt(10);
		System.out.println(num1+" + "+num2+"?");
	}

	public int checkAnswer(int response,int ans) {
		// TODO Auto-generated method stub
		if (response==ans) {
			System.out.println("Correct!");
			return 1;
		}else {
			System.out.println("Wrong!");
			return 0;
		}
	}
	
	public int getAns() {
		return num1+num2;
	}

}