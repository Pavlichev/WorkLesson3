package Lesson2;

public class Task1 {

    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++){

            switch (arr[i]) {
                case 0:
                    arr[i] = 1;
                    break;

                case 1:
                    arr[i] = 0;
                    break;

            }
         System.out.println(arr[i] + " invert");
        }

    }
}






