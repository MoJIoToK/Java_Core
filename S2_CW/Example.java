package S2_CW;

import java.math.BigDecimal;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        BigDecimal a = BigDecimal.valueOf(999999999);

        Scanner scanner = new Scanner(System.in);
        BigDecimal b = scanner.nextBigDecimal();

        System.out.println(b.multiply(a));

        scanner.close();
    }
    
}
