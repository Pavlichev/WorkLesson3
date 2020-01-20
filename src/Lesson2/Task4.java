package Lesson2;

public class Task4 {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j || i == (j - 1)) arr[i][j] = 1;
                System.out.print(arr[i][j]);

            }

        }
    }
}