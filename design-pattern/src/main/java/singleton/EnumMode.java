package singleton;

/**
 * @author wql
 */

public enum EnumMode {
    /**
     * 实例
     */
    INSTANCE;

    public void handle(String msg) {
        System.out.println("handle msg：" + msg + " ...");
    }
}
