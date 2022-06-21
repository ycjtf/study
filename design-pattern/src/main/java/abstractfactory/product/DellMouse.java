package abstractfactory.product;

/**
 * 戴尔鼠标
 *
 * @author wql
 */
public class DellMouse implements Mouse {

    @Override
    public void move() {
        System.out.println("DellMouse::move....");
    }
}
