package Task3;

public class Numbers {

    public static boolean checkNumber(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] * arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }
}
