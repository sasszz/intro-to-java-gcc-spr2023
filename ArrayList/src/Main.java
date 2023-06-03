import java.util.Scanner;
import java.util.ArrayList;
// Write a program that uses the Scanner class to get input and populate an ArrayList

public class Main {
    public static void main(String[] args) {
        // Set variables
        String player1Name;        // First player's name
        String player2Name;        // Second player's name
        // Create an ArrayList to hold some names.
        ArrayList<String> nameList = new ArrayList<String>();

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the player's names.
        System.out.print("Enter the first player's name: ");
        player1Name = keyboard.nextLine();
        System.out.print("Enter the second player's name: ");
        player2Name = keyboard.nextLine();

        nameList.add(player1Name);
        nameList.add(player2Name);

        // Display the items in nameList and their indices.
        for (int index = 0; index < nameList.size(); index++) {
            System.out.println("Index: " + index + " Name: " + nameList.get(index));
        }
    }
}