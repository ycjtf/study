package singleton;

import org.junit.Test;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ycjtf
 */
public class TestCase {
    private static final AtomicInteger i = new AtomicInteger();

    private static final ThreadPoolExecutor EXECUTOR = new ThreadPoolExecutor(20, 20, 0, TimeUnit.SECONDS
            , new PriorityBlockingQueue<>(), r -> new Thread(r, "testPool-thread-" + i.incrementAndGet()), new ThreadPoolExecutor.AbortPolicy());

    @Test
    public void hungryManTest() {
        for (int i = 0; i < 10; i++) {
            EXECUTOR.execute(() -> {
                HungryMan instance = HungryMan.getInstance();
                System.out.println(Thread.currentThread().getName() + "  " + instance);
            });
        }
    }

    @Test
    public void lazyManTest() {
        for (int i = 0; i < 10; i++) {
            EXECUTOR.execute(() -> {
                LazyMan instance = LazyMan.getInstance();
                System.out.println(Thread.currentThread().getName() + "  " + instance);
            });
        }
    }

    @Test
    public void staticInnerClassTest() {
        for (int i = 0; i < 10; i++) {
            EXECUTOR.execute(() -> {
                InnerClass instance = InnerClass.getInstance();
                System.out.println(Thread.currentThread().getName() + "  " + instance);
            });
        }
    }

    @Test
    public void enumTest() {
        EnumMode.INSTANCE.handle("哈哈");
    }
}
