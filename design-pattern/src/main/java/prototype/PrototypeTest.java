package prototype;

import org.junit.Test;

/**
 * @author ycjtf
 */
public class PrototypeTest {

    @Test
    public void sheepTest() {
        Leg leg = new Leg();
        Sheep sheep = new Sheep("苏西", 4, leg);
        // 创建第一个实例
        System.out.println(sheep);
        // 克隆实例对象
        Sheep clone = sheep.clone();
        System.out.println(clone);
        clone.setName("多莉");
        clone.setAge(1);
        // 打印克隆实例属性
        System.out.println(clone);
        // 打印原实例属性
        System.out.println(sheep);
    }
}
