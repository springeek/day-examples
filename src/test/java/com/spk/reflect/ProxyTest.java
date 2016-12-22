/*12/22/16 6:06 PM*/
package com.spk.reflect;

import com.spk.reflect.ProxyService;
import com.spk.reflect.ProxyServiceImpl;
import com.spk.reflect.ServiceProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;


public class ProxyTest {
    @Test
    public void testProxy() {
        System.out.println(new ProxyServiceImpl().doSome());
        System.out.println(new ServiceProxy().doSome());
    }

    @Test
    public void testJavaProxy() {
        ProxyService target = new ProxyServiceImpl();
/*        ProxyService service = (ProxyService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = method.invoke(target, args);
                        result = ((String) result).toUpperCase();
                        return result;
                    }
                });*/
        ProxyService service = (ProxyService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    Object result = method.invoke(target, args);

                    if (result!=null) {
                        result = ((String) result).toUpperCase();
                    }
                    return result;
                });
        System.out.println(target.doSome());
        System.out.println(service.doSome());
        System.out.println(service.doOther());



    }
}
