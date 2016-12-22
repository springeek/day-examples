/*12/22/16 7:29 PM*/
package com.spk.cglib;

import org.junit.Test;

public class CglibTest {
    @Test
    public void testNew() {
        ProxyService service = new CglibProxyFactory().myCglib();
        String result = service.doSome();
        System.out.println(result);
    }
}
