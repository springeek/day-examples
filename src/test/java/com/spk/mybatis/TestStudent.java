/*12/23/16 5:10 PM*/
package com.spk.mybatis;

import org.junit.Test;

import java.util.Date;

public class TestStudent {
    @Test
    public void testStudent() {
        Student student = new Student(18, "刘德华", "alsdkf", "1977-01-22", "ldh@xxx.com");
        new StudentDaoImpl().insertStudent(student);
    }
}
