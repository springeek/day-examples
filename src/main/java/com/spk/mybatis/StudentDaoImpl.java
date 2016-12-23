/*12/23/16 3:21 PM*/
package com.spk.mybatis;

import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class StudentDaoImpl implements StudentDao {
    @Override

    public void insertStudent(Student student) {
        try (SqlSession session = MysqlbatisUtils.getSqlSession()) {
            session.insert("insertStudent", student);
            session.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
