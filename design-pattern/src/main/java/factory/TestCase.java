package factory;

import factory.method.BiYaDiFactory;
import factory.method.WuLiFactory;
import factory.simple.SimpleFactory;
import org.junit.Test;

public class TestCase {

    @Test
    public void simpleFactoryTest() {
        Car wuLing = SimpleFactory.create("wuLing");
        wuLing.sayName();
        Car biYaDi = SimpleFactory.create("biYaDi");
        biYaDi.sayName();
        Car car = SimpleFactory.create(null);
        car.sayName();
    }

    @Test
    public void methodFactoryTest() {
        Car wuLi = new WuLiFactory().getCar();
        wuLi.sayName();
        Car biYaDi = new BiYaDiFactory().getCar();
        biYaDi.sayName();
    }


}
