package abstractfactory.factory;

import abstractfactory.product.Headphone;
import abstractfactory.product.KeyBoard;
import abstractfactory.product.Mouse;

/**
 * 抽象工厂和工厂方法区别:
 * 工厂方法:针对某一种产品的抽象
 * 抽象工厂:对一种产品族的抽象
 *
 * @author wql
 */
public interface AbstractFactory {

    /**
     * 生产耳机
     *
     * @return 耳机
     */
    Headphone productionHeadphone();

    /**
     * 生产键盘
     *
     * @return 键盘
     */
    KeyBoard productionKeyBoard();

    /**
     * 生产鼠标
     *
     * @return 鼠标
     */
    Mouse productionMouse();
}
