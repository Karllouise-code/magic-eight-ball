import java.util.Random;
import java.util.Scanner;

public class theMagicBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your question: ");
        sc.nextLine();
        sc.close();

        Random r = new Random();
        int rand = r.nextInt(5);

        if (rand == 0) {
            System.out.println("\nAs I see it, yes.");
        } else if (rand == 1) {
            System.out.println("Ask again later.");
        } else if (rand == 2) {
            System.out.println("Better not tell you now");
        } else if (rand == 3) {
            System.out.println("Cannot predict now.");
        } else if (rand == 4) {
            System.out.println("Concentrate and ask again.");
        } else if (rand == 5) {
            System.out.println("Don't count on it.");
        } else if (rand == 6) {
            System.out.println("It is certain.");
        } else if (rand == 7) {
            System.out.println("It is decidedly so.");
        }

    }
}