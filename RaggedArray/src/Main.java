public class Main {
    public static void main(String[] args) {
//        Write a Java program that prints out a ragged array

        int[][] arr = new int[][]{
                new int[] { 1, 2, 3, 4 },
                new int[] { 4, 5},
                new int[] { 6, 7, 8},
        };

        // Displaying the elements of 2-D Jagged array
        System.out.println("Elements of 2-D Jagged Array are:");
        for (int[] ints : arr) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
}