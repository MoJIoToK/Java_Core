import java.lang.reflect.Method;
import java.util.Random;

public class lesson3_task1 {

    //@Data
    public static void main(String[] args) {
        var a = Math.class;
        Random random = new Random();
        Class<?> b = random.getClass();

        for (Method declaredMethod : b.getDeclaredMethods()) {
            System.out.println(declaredMethod);

        }
    }
}
