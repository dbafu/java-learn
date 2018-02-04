package com.jikexueyuan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jikexueyuan.dao.UserDao;
import com.jikexueyuan.entity.User;

public class UserDaoImpl implements UserDao {

    /**
     * 保存用户信息
     */
    @Override
    public void save(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn.prepareCall("INSERT INTO tbl_user(name, password, email) VALUES (?, ?, ?)");
        ps.setString(1, user.getName());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getEmail());
        ps.execute();
    }

    /**
     * 根据用户指定的ID更新用户信息
     */
    @Override
    public void update(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn
                .prepareCall("UPDATE TABLE tbl_user SET name = ?, password = ?, email = ? WHERE id = ?");
        ps.setString(1, user.getName());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getEmail());
        ps.setLong(4, user.getId());
        ps.execute();
    }

    /**
     * 删除指定的用户信息
     */
    @Override
    public void delete(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn.prepareCall("DELETE FROM tbl_user WHERE id = ?");
        ps.setLong(1, user.getId());
        ps.execute();
    }

    @Override
    public ResultSet get(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn.prepareCall("SELECT * from tbl_user WHERE name = ? AND password = ?");
        ps.setString(1, user.getName());
        ps.setString(2, user.getPassword());
        return ps.executeQuery();
    }

}
