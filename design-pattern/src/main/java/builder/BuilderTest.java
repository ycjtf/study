package builder;

import org.junit.Test;

/**
 * @author ycjtf
 * @description 建造者模式，属性字段较多时推荐使用，创建不可变属性对象时推荐使用
 */
public class BuilderTest {

    @Test
    public void builderTest() {
        Computer.Builder builder = new Computer.Builder("intel", "16G");
        builder.setDisplay("intel 机械键盘").setKeyboard("机械键盘");
        Computer computer = builder.build();
        System.out.println(computer);
    }
}
