import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int number = random.nextInt(100);

        int chance = 0;

        while (chance < 3) {
            System.out.println("Guess a number between 1 and 100:");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Excellent you guessed right");
                break;
            } else if (guess < number) {
                System.out.println("Increase your guess.");
            } else {
                System.out.println("Lower your guess.");
            }
            chance++;
        }
        
        if (chance == 3) {
            System.out.println("Better Luck Next Time \nThe number was " + number + ".");
        }
    }
}


