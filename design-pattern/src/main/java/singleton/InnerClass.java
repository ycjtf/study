package singleton;

/**
 * @author w
 * @date 2021/03/14
 * @description InsideClass第一次被加载的时候不会初始化 INSIDE_CLASS ,
 * 只有在第一次调用 InsideClass.getInstance()方法时,才会加载并创建
 * INSIDE_CLASS 对象,既能保证类的唯一性,也不用加锁,写起来也更简单
 */
public class InnerClass {

    private InnerClass() {
    }

    public static InnerClass getInstance() {
        return Inner.INNER_CLASS;
    }

    private static class Inner {

        private static final InnerClass INNER_CLASS = new InnerClass();
    }
}
