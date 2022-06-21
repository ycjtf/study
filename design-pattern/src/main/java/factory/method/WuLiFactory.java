package factory.method;

import factory.Car;
import factory.WuLiHongGuang;

/**
 * @author ycjtf
 * 工厂方法模式
 */
public class WuLiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLiHongGuang();
    }
}
