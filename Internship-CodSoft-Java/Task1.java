import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        int min = 1;
        int max = 100;
        int value = ran.nextInt((max - min) + 1) + min;
        int input;
        System.out.println("Enter number of Maximum chance allowed..\n");
        int max_chance = sc.nextInt();
        do {

            System.out.println("You have " + max_chance + " left...\n" + "Enter your guess..\n");
            input = sc.nextInt();

            if (Math.abs(value - input) <= 20) {
                System.out.println("You are close to guessed number..\n");
            } else if (Math.abs(value - input) <= 40) {
                System.out.println("You are little far from guessed number..\n");
            } else if (Math.abs(value - input) <= 60 || Math.abs(value - input) <= 80) {
                System.out.println("You are  far from guessed number..\n");
            } else if (input > 100) {
                System.out.println("You entered wrong input..");
            }
            max_chance--;

        } while ((input != value) && (max_chance != 0));
        if (input == value) {
            System.out.println("\nCongratulations.. You guessed number correctly..\n");
        } else {
            System.out.println("OOP's!! You Loose..\nRandom number generated was " + value);
        }
        sc.close();
    }
}