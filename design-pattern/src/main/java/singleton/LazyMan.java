package singleton;

/**
 * 恶汉式
 *
 * @author w
 * @date 2021/03/14
 */
public class LazyMan {

    //volatile禁止指令重排序
    private static volatile LazyMan instance;

    private LazyMan() {
    }

    public static LazyMan getInstance() {
        // DCL 双重验证加锁,尽可能不加锁
        if (instance == null) {
            synchronized (LazyMan.class) {
                if (instance == null) {
                    instance = new LazyMan();
                }
            }
        }
        return instance;
    }

}

