package encapsulation;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {


    int[]arr = {3,5,6,7,3,8,9,3};
    int x = 3;
    int NewArrayCounter =0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != x){
                NewArrayCounter++;
            }
        }
        System.out.println(NewArrayCounter);
        int[] arr2=new int[NewArrayCounter];

        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != x){
                arr2[j]=arr[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }

}
