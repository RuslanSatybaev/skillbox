package arrays_collection;

public class AddTask {
    public static void main(String[] args) {
        String[][] xArrays = new String[7][7];
        for (int i = 0; i < xArrays.length; i++) {
            for (int j = 0; j < xArrays[i].length; j++) {
                xArrays[i][j] = (j == i || j == xArrays.length - 1 - i) ? "x" : " ";
                System.out.print(xArrays[i][j]);
            }
            System.out.println();
        }
    }
}
