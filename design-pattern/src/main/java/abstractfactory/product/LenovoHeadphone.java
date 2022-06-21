package abstractfactory.product;

/**
 * 联想耳机
 *
 * @author wql
 */
public class LenovoHeadphone implements Headphone {

    @Override
    public void play() {
        System.out.println("LenovoHeadphone::play....");
    }
}
