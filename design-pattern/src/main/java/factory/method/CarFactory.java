package factory.method;

import factory.Car;

/**
 * @author ycjtf
 *
 * 1.创建工厂接口,规范工厂类所需要实现的功能
 * 2.符合开闭原则,每次新增实现时,无需修改原代码,只需要创建新的工厂实现
 * 3.代码量会越来越大
 */
public interface CarFactory {

    Car getCar();
}
