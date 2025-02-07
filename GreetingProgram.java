import java.util.Scanner; // Import the Scanner class to read user input

public class GreetingProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read the user's input

        // Greet the user
        System.out.println("Hello, " + name + "! Welcome to the Java world!");

        // Close the scanner to free up resources
        scanner.close();
    }
}