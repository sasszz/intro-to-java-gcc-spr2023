public class Main {
    public static void main(String[] args) {
        int [][] raggedArray = new int[3][];
        raggedArray[0] = new int[2];
        raggedArray[0][0] = 0;
        raggedArray[0][1] = 0;
        raggedArray[1] = new int[3];
        raggedArray[1][0] = 0;
        raggedArray[1][1] = 0;
        raggedArray[1][2] = 0;
        raggedArray[2] = new int[2];
        raggedArray[2][0] = 0;
        raggedArray[2][1] = 0;
        Main.printRaggedArray(raggedArray);
    }
    private static void printRaggedArray(int[][] raggedArray){
        for(int i = 0; i < raggedArray.length; i++) {
            System.out.format("%s", "\n");
            for(int j = 0; j < raggedArray[i].length; j++){
                System.out.print(raggedArray[i][j]);
            }
        }
    }
}