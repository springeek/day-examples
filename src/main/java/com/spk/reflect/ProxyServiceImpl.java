/*12/22/16 6:03 PM*/
package com.spk.reflect;

public class ProxyServiceImpl implements ProxyService {
    @Override
    public String doSome() {
        return "some";
    }

    @Override
    public String doOther() {
        return null;
    }
}
