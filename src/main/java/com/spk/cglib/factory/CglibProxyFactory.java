/*12/22/16 7:26 PM*/
package com.spk.cglib.factory;

import com.spk.cglib.service.ProxyService;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        ProxyService service = new ProxyService();
        System.out.println(o.getClass().getName());
        Object result = method.invoke(service, objects);
        if (result != null) {
            result = ((String) result).toUpperCase();
        }
        return result;
    }

    public ProxyService myCglib() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(ProxyService.class);
        enhancer.setCallback(this);
        return (ProxyService) enhancer.create();
    }

}
