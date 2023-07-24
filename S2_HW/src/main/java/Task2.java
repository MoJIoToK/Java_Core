import java.util.Scanner;

/*Написать метод «Шифр Цезаря», с булевым параметром зашифрования и расшифро- вания и числовым ключом;
*/
public class Task2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();
        System.out.println("Ввод: " + in);

        String out1 = caesar(in, 33, true);
        System.out.println("Шифровка: " + out1);
        System.out.println();

        String out2 = caesar(out1, 33, false);
        System.out.println("Расшифровка: " + out2);

    }

    private static String caesar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty())
            return null;

        final int len = in.length();
        char[] out = new char[len];
        for (int i = 0; i < len; ++i) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
        }
        return new String(out);
    }

}
