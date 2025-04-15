import java.util.*;
public class guess_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = (int) (Math.random() * 100) + 1;
        int guess = 0;
        System.out.println("*************************************");
        System.out.println("         Welcome to the game!       " );
        System.out.println();

        while(guess != target) {
            System.out.println("Enter the guess number from 1 to 100: ");
            guess = sc.nextInt();
            if(guess < target) {
                System.out.println("Too low!");
            } else if (guess > target) {
                System.out.println("Too high!");
            }
            else {
                System.out.println("Congratulations, you guessed it correctly!");
            }
        }
        sc.close();
        System.out.println();
        System.out.println("*************************************");
        System.out.println("              Game Over!             ");
    }
}