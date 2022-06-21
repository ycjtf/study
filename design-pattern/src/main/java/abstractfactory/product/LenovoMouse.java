package abstractfactory.product;

/**
 * 联想鼠标
 *
 * @author wql
 */
public class LenovoMouse implements Mouse {

    @Override
    public void move() {
        System.out.println("LenovoMouse::move....");
    }
}
