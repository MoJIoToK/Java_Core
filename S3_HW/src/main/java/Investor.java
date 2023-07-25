import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*2. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения
    зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную
    плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в
    общий массив сотрудников.
    Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
*/

@Setter
@Getter
public class Investor extends Employee{
    public Investor(String name, String midName, String surName, String position, String phone, int salary, int age) {
        super(name, midName, surName, position, phone, salary, age);
    }

}
