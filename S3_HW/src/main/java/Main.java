import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Employee ivan = new Employee("Ivan", "Aleksandrovich", "Bubkov", "CEO", "1", 1000000, 1980);
        employees.add(ivan);
        employees.add(new Investor("Nickolas", "Aleksandrovich", "Sabakevich", "BOSS", "001", 9999999, 1996));
        employees.add(new Employee("Olga", "Victorovna", "Vasilieva", "accountant", "2", 200000, 1990));
        employees.add(new Employee("Vasilisa", "Nikolaevna", "Borisova", "assistant", "3", 100000, 2000));
        employees.add(new Employee("Egor", "Olegovich", "Shmatko", "Head of Security", "4", 150000, 1983));
        employees.add(new Employee("Sergey", "Pavlovich", "Korolev", "Scientist", "0001", 9999999, 1966));

//        getAllInfo(employees);
//
//        //Employee.increaser(employees, 30, 5000);
//        //increaser(employees, 30, 5000);
//
//        System.out.println();
//        getAllInfo(employees);
//
//        float avgAge = getAverageAge(employees);
//        System.out.printf("Средний возраст в компании: %.1f\n", avgAge);
//
//        float avgSalary = getAverageSalary(employees);
//        System.out.printf("Средная зарплата в компании: %.1f\n", avgSalary);

        // 2 Task
        getAllInfo(employees);
        System.out.println();
        Investor.increaser(employees, 5000);
        getAllInfo(employees);
    }

    private static float getAverageSalary(ArrayList<Employee> employees) {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }

    private static float getAverageAge(ArrayList<Employee> employees) {
        float sum = 0;
        for (Employee employee : employees) {
            sum += employee.getAge();
        }
        return sum / employees.size();
    }

//    private static void increaser(ArrayList<Employee> employees, int age, int increase) {
//        for (Employee employee : employees) {
//            if (employee.getAge() > age) {
//                employee.increaseSalary(increase);
//            }
//        }
//    }


//    private static void increaseSalary(ArrayList<Employee> employees, int age, int increase) {
//        for (Employee employee : employees) {
//            if (employee.getAge() > age) {
//                employee.setSalary(employee.getSalary() + increase);
//            }
//
//        }
//    }

    private static void getAllInfo(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
