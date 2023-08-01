package generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 原则：PSCE
 */
public class TestCase {

    @Test
    public void t0() {
        p(new ArrayList<Person>());
        c(new ArrayList<Child>());
    }

    void p(List<? super Person> dataList) {
        dataList.add(new Child());
        dataList.add(new Person());
        dataList.forEach(System.out::println);
    }

    void c(List<? extends Child> dataList) {
        dataList.forEach(System.out::println);
    }
}


class Person {

}

class Child extends Person {

}

