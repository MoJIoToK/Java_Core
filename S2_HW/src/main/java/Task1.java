import java.util.Arrays;

public class Task1 {

    /*Доделать сортировку подсчетом с урока (если нет, реализовать)
     классическим способом через промежуточный массив (см. последние минут 10 семинара)
    */

    public static void main(String[] args){

        int[] arr = {0, -2, 3, 1, 0, 0, 1};//{-2, 3, 0, 3, 1, -5, -6, 10, 6, 1};
        int[] resultArr = countSort(arr);
        System.out.println("Source array: " + Arrays.toString(arr));
        System.out.println("Count-sorted array: " + Arrays.toString(resultArr));

    }

    public static int[] countSort(int[] arr){
        int max = getMax(arr);
        int min = getMin(arr);

        int[] result = new int[arr.length];
        int[] tmpArr = new int[max - min + 1];

        for (int el : arr) {
            tmpArr[el - min]++;
        }

        int index = 0;
        for (int i = 0; i < tmpArr.length; i++) {
            for (int j = tmpArr[i]; j > 0; j--){
                result[index++] = i + min;
            }
        }

        return result;
    }

    public static int getMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }

        return max;
    }
    public static int getMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i: arr) {
            min = Math.min(min, i);
        }
        return min;
    }

}
