package abstractfactory.factory;

import abstractfactory.product.*;

/**
 * 戴尔工厂
 *
 * @author ycjtf
 */
public class DellFactory implements AbstractFactory {

    @Override
    public Headphone productionHeadphone() {
        return new DellHeadphone();
    }

    @Override
    public KeyBoard productionKeyBoard() {
        return new DellKeyBoard();
    }

    @Override
    public Mouse productionMouse() {
        return new DellMouse();
    }
}
