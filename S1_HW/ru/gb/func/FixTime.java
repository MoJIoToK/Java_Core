package S1_HW.ru.gb.func;

import java.time.LocalDate;

public class FixTime {

    public static void fixingTime(){
        LocalDate time;
        time = LocalDate.now();
        System.out.println("Запись в файл: " + time);
    }
    
}
