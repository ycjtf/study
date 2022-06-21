package factory.method;

import factory.BiYaDi;
import factory.Car;

public class BiYaDiFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new BiYaDi();
    }
}
