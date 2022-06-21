package abstractfactory.product;

/**
 * 戴尔耳机
 *
 * @author wql
 */
public class DellHeadphone implements Headphone {

    @Override
    public void play() {
        System.out.println("DellHeadPhone::play....");
    }
}
