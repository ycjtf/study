package factory.simple;

import factory.BiYaDi;
import factory.Car;
import factory.WuLiHongGuang;

/**
 * @author ycjtf
 *
 * 简单工厂模式
 * 1.每增加一个实现需要修改原来的代码 #create() 方法
 * 2.不符合开闭原则
 */
public class SimpleFactory {

    public static Car create(String type) {
        if ("wuLing".equals(type)) {
            return new WuLiHongGuang();
        } else if ("biYaDi".equals(type)) {
            return new BiYaDi();
        } else {
            return () -> System.out.println("未知类型,type:" + type);
        }
    }
}
