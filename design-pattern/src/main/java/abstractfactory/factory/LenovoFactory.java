package abstractfactory.factory;

import abstractfactory.product.*;

/**
 * 联想工厂
 *
 * @author wql
 */
public class LenovoFactory implements AbstractFactory {

    @Override
    public Headphone productionHeadphone() {
        return new LenovoHeadphone();
    }

    @Override
    public KeyBoard productionKeyBoard() {
        return new LenovoKeyBoard();
    }

    @Override
    public Mouse productionMouse() {
        return new LenovoMouse();
    }
}
