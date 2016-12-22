/*12/22/16 7:29 PM*/
package com.spk.cglib;

import com.spk.cglib.service.ProxyService;
import org.junit.Test;
import com.spk.cglib.factory.CglibProxyFactory;
public class CglibTest {
    @Test
    public void testNew() {
        ProxyService service = new CglibProxyFactory().myCglib();
        String result = service.doSome();
        System.out.println(result);
    }
}
