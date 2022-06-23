package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyAnimal implements InvocationHandler {

    private final IAnimal target;

    public ProxyAnimal(IAnimal animal) {
        this.target = animal;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前do...");
        Object returnVal = method.invoke(target, args);
        System.out.println("代理后do...");
        return returnVal;
    }

}
