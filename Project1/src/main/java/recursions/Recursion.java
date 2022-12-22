package recursions;

public class Recursion {
   public static void main(String[] args) {
      int[] arr = new int[]{4, 98, 15, 324, 43, 23, 47, 86, 3, 42};
      int max1 = findMaxIterative(arr);
      System.out.println("max from iterative" + max1);

      int max2 = findMaxDivideAndConquer(arr, 0);
      System.out.println("max from divide and conquer" + max2);


      //  int index = binarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
      // System.out.println("binary Search of number 67 : " + index);

   }

   //{4, 98, 15, 324, 43, 23, 47, 86, 3, 42}

   static int findMaxDivideAndConquer(int[] arr, int index) {
      int max2;
      int length = arr.length;

      if (length > index) {

         max2 = findMaxDivideAndConquer(arr, index + 1);
         System.out.println("length arr + index " + index);

         if (arr[index] > max2) {
            System.out.println("arr index" + arr[index]);
            return arr[index];

         } else {
            return max2;
         }
      } else {
         return arr[length - 1];
      }
   }
   // arr = [4, 98, 15, 324, 43, 23, 47, 86, 3, 42]
   // call findMaxDivideAndConquer(arr, 0)
   // length = 10, index = 0
   // 10 > 0 => true
   // max = ??
   //      call findMaxDivideAndConquer(arr, 1)
   //      length = 10, index = 1
   //      10 > 1 => true
   //      max = ??
   //          call findMaxDivideAndConquer(arr, 2)
   //          length = 10, index = 2
   //          10 > 2 => true
   //          max = ??
   //              call findMaxDivideAndConquer(arr, 3)
   //              ...
   //                  call findMaxDivideAndConquer(arr, 8)
//                      length = 10, index = 8
//                      10 > 8 => true
//                      max = ??
   //                      call findMaxDivideAndConquer(arr, 9)
   //                      length = 10, index = 9
   //                      10 > 9 => true
   //                      max = ??
   //                          call findMaxDivideAndConquer(arr, 10)
   //                          length = 10, index = 10
   //                          10 > 10 => false
   //                          return arr[9] (arr[10-1]) (line 108)
   //                      max = 42 (arr[9])
   //                      arr[9] = 24
   //                      42 > 42 => false
   //                      return 42
   //                  max = 42
   //                  arr[8] = 3
   //                  3 > 42 = > false
   //                  return 42


   private static int findMaxIterative(int[] arr) {
      int max = arr[0];

      for (int i = 1; i < arr.length; i++) {

         if (arr[i] > max) {
            max = arr[i];
         }

      }

      return max;
   }

/*
   //Итеративный подход , Бинарный поиск
   public static int binarySearch(int arr[], int elementToSearch) {
      int firstIndex = 0;
      int lastIndex = arr.length - 1;

      while (firstIndex <= lastIndex) {
         int midddleIndex = (firstIndex + lastIndex) / 2;
         // если средний элемент - целевой элемент, вернуть его индекс
         if (arr[midddleIndex] == elementToSearch) {
            return midddleIndex;
         }
         // если средний элемент меньше
         // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
         else if (arr[midddleIndex] < elementToSearch) {
            firstIndex = midddleIndex + 1;

         }
         // если средний элемент больше
         // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
         else if (arr[midddleIndex] > elementToSearch) {
            lastIndex = midddleIndex - 1;

         }

      }
      return -1;
   }


 */

   public static int recursiveBinarySearch(int arr[], int firstElem, int lastElem, int elemToSearch) {

      // условие прекращения
      if (lastElem >= firstElem) {
         int mid = firstElem + (lastElem - firstElem) / 2;
// если средний элемент - целевой элемент, вернуть его индекс
         if (arr[mid] == elemToSearch) {
            return mid;

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
           // if (arr[mid] > elemToSearch) {
              // return recursiveBinarySearch(arr, firstElem, mid - 1, elemToSearch);
               // также, вызываем метод рекурсивно по суженным данным
               // return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
            }

         }


      return firstElem;
   }
}


