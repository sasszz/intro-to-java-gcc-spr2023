import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intakeUserInputFromConsole = new Scanner(System.in);

        String positive = "y";
        String heads = "h";

        System.out.println("Wanna play a game of heads or tails? (y/n)");
        String inputFromUser = intakeUserInputFromConsole.nextLine();

        if (inputFromUser.compareTo(positive) == 0) {
            System.out.println("Yay! Let's play");
            System.out.println("Heads or Tails? (h/t)");
            String headsOrTailsFromUser = intakeUserInputFromConsole.nextLine();
            int zeroOrOne = (int) Math.round(Math.random());
            if(headsOrTailsFromUser.compareTo(heads) == 0){
                if(zeroOrOne == 0) {
                    System.out.println("HEADS! You won!");
                }
                else {
                    System.out.println("Tails... You lost...");
                }
            }
            else {
                if(zeroOrOne == 1) {
                    System.out.println("It's tails! You won!");
                }
                else {
                    System.out.println("Awe it's heads :/ You lost...");
                }
            }
        }
        else {
            System.out.println("Okee next time :'[");
        }
    }
}