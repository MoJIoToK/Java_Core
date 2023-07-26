import lombok.Setter;

import java.util.ArrayList;

@Setter
//@AllArgsConstructor
public class Employee {

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

//    public static void increaser(ArrayList<Employee> employees, int age, int increase){
//        for (Employee employee : employees) {
//            if (employee.getAge() > age) {
//                employee.increaseSalary(increase);
//            }
//        }
//    }

    public void increaseSalary(int amount){
        this.salary += amount;
    }

    @Override
    public String toString() {
        return String.format("Employee {name= %s, midname= %s, surname= %s, position= %s, phone= %s, salary= %d, age= %d", name, midName, surName, position, phone, salary, getAge());
    }
}
