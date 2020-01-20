package Lesson2;

public class Task7 {

    public static void main(String[] args) {
        int[] arr = {2, 10, 9, 5, 1, 3, 2, 8};
        int min = arr[0], max = arr[0], i, imin = 0, imax = 0;
        for(i = 0; i != arr.length; i++)
        {
            if(arr[i] < min){
                min = arr[i];imin = i;
            }
            if(arr[i] > max){
                max = arr[i];imax = i;
            }
            System.out.println("max = " + max + " min = " + min);
            System.out.println("imax = " + imax + " imin = " + imin);
        }
    }
}
