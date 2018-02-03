package com.jikexueyuan.test;

import java.sql.Connection;

import com.jikexueyuan.util.ConnectionFactory;

public class ConnectionFactoryTest {

    public static void main(String[] args) throws Exception {
        ConnectionFactory cf = ConnectionFactory.getInstance();
        Connection conn = cf.createConnetion();
        System.out.println(conn.getAutoCommit());
    }

}
