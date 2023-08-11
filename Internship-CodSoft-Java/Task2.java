// Word Counter
// 1. Prompt the user to enter a text or provide a file to count the words.
// 2. Read the input text or file and store it in a string.
// 3. Split the string into an array of words using space or punctuation as delimiters.
// 4. Initialize a counter variable to keep track of the number of words.
// 5. Iterate through the array of words and increment the counter for each word encountered.
// 6. Display the total count of words to the user.

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task2 {

    public static String readFileAsString(String fileName)
            throws Exception {
        String data = "";
        data = new String(
                Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = "";

        System.out.println("For text press 1\n For File press 2");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.println("Enter text...");
            str += sc.nextLine();
            System.out.println(str);

        } else if (choice == 2) {
            str = readFileAsString("test.txt");

        }

        int counter = 0;
        String[] strArray = str.split("\\s+|\\p{Punct}");
        for (int i = 0; i < strArray.length; i++) {
            counter++;
        }
        System.out.println("\nTotal Words in Text = " + counter);
        sc.close();
    }
}