package Task1;

import java.util.Arrays;

public class Massiv {
    public static void main(String[] args) {

        //System.out.println(Arrays.toString(Massiv.deleteElementFromArray(new int[]{4,5,7,-3,7,8},7)));

    }

    static int counter = 0;

    public static int[] deleteElementFromArray(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {   //считаем колличесво эл в кот нужно удалить
                counter++;
            } else {
                arr[i - counter] = arr[i]; //от общего кол.ва массива эл.в вычисляем коунтер
            }
        }
        return Arrays.copyOf(arr,arr.length - counter);
    }

}