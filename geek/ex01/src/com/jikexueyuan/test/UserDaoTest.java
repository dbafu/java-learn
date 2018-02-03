package com.jikexueyuan.test;

import java.sql.Connection;

import com.jikexueyuan.dao.UserDao;
import com.jikexueyuan.dao.impl.UserDaoImpl;
import com.jikexueyuan.entity.User;
import com.jikexueyuan.util.ConnectionFactory;

public class UserDaoTest {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getInstance().createConnetion();
            conn.setAutoCommit(false);

            UserDao userDao = new UserDaoImpl();
            User tom = new User();
            tom.setName("Tom");
            tom.setPassword("123456");
            tom.setEmail("tom@gmail.com");

            userDao.save(conn, tom);

            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
        }
    }

}
