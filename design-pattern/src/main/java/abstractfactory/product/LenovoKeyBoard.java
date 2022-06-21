package abstractfactory.product;

/**
 * 联想键盘
 *
 * @author wql
 */
public class LenovoKeyBoard implements KeyBoard {

    @Override
    public void input() {
        System.out.println("LenovoKeyBoard::input....");
    }
}
