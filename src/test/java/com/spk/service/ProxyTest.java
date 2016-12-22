/*12/22/16 6:06 PM*/
package com.spk.service;

import com.spk.proxy.ServiceProxy;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void testProxy() {
        System.out.println( new ProxyServiceImpl().doSome());
        System.out.println( new ServiceProxy().doSome());
    }
}
