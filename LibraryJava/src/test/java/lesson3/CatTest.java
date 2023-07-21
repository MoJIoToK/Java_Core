package lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void add() {
        Cat cat = new Cat();
        Assertions.assertEquals(12, cat.add(5,7));
    }

    @Test
    void add1() {
        Cat cat = new Cat();
        Assertions.assertEquals(0, cat.add(Integer.MAX_VALUE,7));
    }
}