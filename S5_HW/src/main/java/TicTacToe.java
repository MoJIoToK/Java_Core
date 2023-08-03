import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * 2. Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и
 * представляют собой, например, состояния ячеек поля для игры в крестикинолики, где 0 – это пустое
 * поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
 * Такое предположение позволит хранить в одном числе типа int всё поле 3х3. Реализовать функционал
 * с записью в файл и обратно игрового поля.
 * Выводить в консоль игровое поле после импорта, заменяя числа символами X, O, •(пусто)
 */
public class TicTacToe {

    public static void save() throws IOException {
        int[] ar2 = {0, 1, 2, 3, 0, 1, 2, 3, 0};

        FileOutputStream fos = new FileOutputStream("save1.out");
        for (int b = 0; b < 3; b++) { // write to 3 bytes
            byte wr = 0;
            for (int v = 0; v < 3; v++) { // write by 3 values in each
                wr += (byte) (ar2[3 * b + v] << (v * 2));
            }
            fos.write(wr);
        }

        fos.flush();
        fos.close();
    }

    public static void load() throws IOException {
        int[] ar20 = new int[9];

        FileInputStream fis = new FileInputStream("save1.out");
        int b;
        int i = 0;
        while ((b = fis.read()) != -1) {
            for (int v = 0; v < 3; ++v) { // 3 values of four possible
                ar20[i++] = b >> (v * 2) & 0x3;
            }
        }
        fis.close();

        System.out.println(Arrays.toString(ar20));
        for (int i1 : ar20) {
            if (i1 == 1) {
                System.out.print("X, ");
            } else if (i1 == 2) {
                System.out.print("O, ");
            } else {
                System.out.print("., ");
            }
        }

    }
}
