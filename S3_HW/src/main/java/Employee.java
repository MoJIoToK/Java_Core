import lombok.Setter;

@Setter
//@AllArgsConstructor
public class Employee {
    /*
    * – Создать класс ”Сотрудник”с полями: ФИО, должность, телефон, зарплата, возраст;
    – Написать метод выводящую всю доступную информацию об объекте с использованием форматирования строк.
    – Создать массив из 5 сотрудников
    – Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000. Возраст и размер
    * повышения должны быть параметрами метода.
    – Написать тот же метод повышения в качестве статического в классе сотрудника. Метод должен
    * принимать в качестве параметра массив сотрудников.
    – Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и
    * среднюю зарплату сотрудников, вывести результаты работы в консоль.
    2. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения
    * зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную
    * плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в
    * общий массив сотрудников.
    * Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
    * */
    String name;
    String midName;
    String surName;
    String position;
    String phone;
    int salary;
    int age;

    private static final int CURREANT_YEAR = 2023;

    public Employee(String name, String midName, String surName, String position, String phone, int salary, int age) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return CURREANT_YEAR - age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee {name= %s, midname= %s, surname= %s, position= %s, phone= %s, salary= %d, age= %d", name, midName, surName, position, phone, salary, getAge());
        //return String.format("Employee {name= %s, midname= %s, surname= %s, position= %s, phone= %s,", name, midName, surName, position);
    }
}
