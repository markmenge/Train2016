
import java.util.Random;
import java.util.Scanner; 

public class Test1 {

	public static void main(String[] args) {
		System.out.println("Guess a number between 1 and 100:");

		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int guess = -1;

		int number = r.nextInt(100);

		while (guess != number)
		{
			guess = scan.nextInt();
			if (guess < number)
				System.out.println("Too low");
			else
				System.out.println("Too high");
		}
		System.out.println("You guessed it!");
	}

}
