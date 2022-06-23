package proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void jdkProxyTest() {
        Dog dog = new Dog();
        ClassLoader classLoader = dog.getClass().getClassLoader();
        Class<?>[] interfaces = dog.getClass().getInterfaces();
        ProxyAnimal proxyObj = new ProxyAnimal(dog);
        IAnimal animal = (IAnimal) Proxy.newProxyInstance(classLoader, interfaces, proxyObj);
        animal.sayHello();
    }
}
