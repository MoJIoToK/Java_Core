import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee ivan = new Employee("Ivan", "Aleksandrovich", "Bubkov", "CEO", "1", 1000000, 1980);
        employees.add(ivan);
        employees.add(new Employee("Nickolas", "Aleksandrovich", "Sabakevich", "BOSS", "001", 9999999, 1996));
        employees.add(new Employee("Olga", "Victorovna", "Vasilieva", "accountant", "2", 200000, 1990));
        employees.add(new Employee("Vasilisa", "Nikolaevna", "Borisova", "assistant", "3", 100000, 2000));
        employees.add(new Employee("Egor", "Olegovich", "Shmatko", "Head of Security", "4", 150000, 1980));


        getAllInfo(employees);

        increaseSalary(employees, 30, 5000);

        getAllInfo(employees);


    }

    private static void increaseSalary(ArrayList<Employee> employees, int age, int increase) {
        for (Employee employee : employees) {
            if (employee.getAge() > age) {
                employee.setSalary(employee.getSalary() + increase);
            }

        }
    }

    private static void getAllInfo(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }






}
