/*12/22/16 6:17 PM*/
package com.spk.reflect;

public class ServiceProxy implements ProxyService {
    ProxyService service ;
    public ServiceProxy() {
        service = new ProxyServiceImpl();
    }

    @Override
    public String doSome() {
        return service.doSome().toUpperCase();
    }

    @Override
    public String doOther() {
        return null;
    }
}
