package com.spk.mybatis;/*12/23/16 8:24 PM*/

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MysqlbatisUtils {
    private static SqlSessionFactory sessionFactory;

    public static SqlSession getSqlSession() throws IOException {
        if (sessionFactory == null) {
             sessionFactory =
                    new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
        }
        return sessionFactory.openSession();
    }

    private MysqlbatisUtils() {
    }
}
