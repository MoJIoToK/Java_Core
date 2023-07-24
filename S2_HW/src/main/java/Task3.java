import java.util.Arrays;

public class Task3 {
    /*Написать метод, принимающий на вход массив чисел и параметр n. Метод должен осуществить
    циклический (последний элемент при сдвиге становится первым) сдвиг всех элементов массива на n позиций;
    * */
    public static void main(String[] args) {

        int[] in = {1, 2, 3, -4, 5, -6};
        System.out.println("Ввод: " + Arrays.toString(in));

        shifter(in, 3);
        System.out.println("Вывод: " + Arrays.toString(in));

    }

    private static void shifter(int[] a, int n) {
        n %= a.length;
        int shift = a.length + n;
        shift %= a.length;

        for (int i = 0; i < shift; i++) {
            int temp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
        }
    }


}
