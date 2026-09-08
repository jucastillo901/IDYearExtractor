import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read data from the keyboard
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the 11 digit ID number
        System.out.println("Enter your 11 digit ID number: ");

        // Read the 11 digit ID number entered by the user
        long number = input.nextLong();

        // Extratc the first tow digits, wich represent the year
        long year = number / 1000000000;

        // Display the extracted year
        System.out.println(year);
    }
}