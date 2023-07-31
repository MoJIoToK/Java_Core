import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class Consumer {

    final int CURRENT_YEAR = 2023;
    String name;
    String lastName;
    String middleName;
    int age;
    String phone;

    public Consumer(String name, String lastName, String middleName, int age, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return CURRENT_YEAR - this.age;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("Consumer{name= '%s', lastName= '%s', middleName= '%s', age= '%d', phone= '%s'}",
                name, lastName, middleName, age, phone);
    }
}
