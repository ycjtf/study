package prototype;

/**
 * 实现 Cloneable 接口，并重写 #clone 方法,
 * 如果成员变量是引用类型，那么该成员变量的类也需要实现 Cloneable 接口,
 * 并在 #clone 方法中显式的为clone后的对象赋值
 *
 * @author ycjtf
 * @see Cloneable
 * @see #clone()
 */
public class Sheep implements Cloneable {

    private String name;

    private int age;

    private Leg leg;

    public Sheep(String name, int age, Leg leg) {
        this.name = name;
        this.age = age;
        this.leg = leg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", leg=" + leg +
                '}';
    }

    @Override
    public Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
            if (leg != null) {
                // 当成员变量不是基本类型时，需要对成员变量进行克隆
                sheep.leg = leg.clone();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}

class Leg implements Cloneable {

    @Override
    public Leg clone() throws CloneNotSupportedException {
        return (Leg) super.clone();
    }

}