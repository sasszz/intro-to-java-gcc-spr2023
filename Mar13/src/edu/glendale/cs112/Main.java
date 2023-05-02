package edu.glendale.cs112;

public class Main {
    public static void main(String[] args) {
        Main adding = new Main();
        int second = adding.addTwoNumbersTogether(6, 4);
        System.out.println("The 1 following sentence will be printed " + "in a tabbed format: " + "\n\tFirst = " + 5 * 6 + ", " + "\n\tSecond = " + second + "," + "\n\tThird = " + 16.7 / 2 + ".");
    }

    int addTwoNumbersTogether(int a, int b) {
        return a + b;
    }
}