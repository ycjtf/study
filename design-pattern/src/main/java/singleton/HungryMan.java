package singleton;

/**
 * 懒汉式
 *
 * @author wql
 * @date 2021/03/14
 */
public class HungryMan {

    private static final HungryMan INSTANCE = new HungryMan();

    private HungryMan() {
    }

    public static HungryMan getInstance() {
        return INSTANCE;
    }

}
