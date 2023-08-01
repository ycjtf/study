import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    public static void main(String[] args) throws InterruptedException {
        WeakReference<Object> reference = new WeakReference<>(new Object());
        System.out.println(reference.get());
        System.gc();
        Thread.sleep(2000);
        System.out.println(reference.get());
    }
}
