package abstractfactory;

import abstractfactory.factory.AbstractFactory;
import abstractfactory.factory.DellFactory;
import abstractfactory.factory.LenovoFactory;
import abstractfactory.product.Headphone;
import abstractfactory.product.KeyBoard;
import abstractfactory.product.Mouse;
import org.junit.Test;

/**
 * @author w
 */
public class AbstractFactoryTest {

    @Test
    public void lenovoFactory() {
        AbstractFactory factory = new LenovoFactory();
        Mouse mouse = factory.productionMouse();
        mouse.move();
        Headphone headphone = factory.productionHeadphone();
        headphone.play();
        KeyBoard keyBoard = factory.productionKeyBoard();
        keyBoard.input();
    }

    @Test
    public void dellFactory() {
        AbstractFactory factory = new DellFactory();
        Mouse mouse = factory.productionMouse();
        mouse.move();
        Headphone headphone = factory.productionHeadphone();
        headphone.play();
        KeyBoard keyBoard = factory.productionKeyBoard();
        keyBoard.input();
    }
}
