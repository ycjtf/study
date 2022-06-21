package abstractfactory.product;

/**
 * 戴尔键盘
 *
 * @author wql
 */
public class DellKeyBoard implements KeyBoard {

    @Override
    public void input() {
        System.out.println("DellKeyBoard::input....");
    }
}
