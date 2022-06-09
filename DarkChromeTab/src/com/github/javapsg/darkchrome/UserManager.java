package com.github.javapsg.darkchrome;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserManager {

	public ArrayList<String> getMemberList() {
		ArrayList<String> list = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select id from user";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(rs.getString("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return list;
	}

	public int insertMember(String userId, String userPwd) {
		int n = 0;

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into user values(?, ?)";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);

		}
		return n;
	}

	public int updateMember(String userId, String userpwd) {
		int n = 0;

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update user set pwd=? where id=?";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userpwd);
			pstmt.setString(2, userId);
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

		return n;
	}

	public int deleteMember(String userId) {
		int n = 0;

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from user where id=?";

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

		return n;
	}

	public boolean getMemberPwd(String id, String pwd) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select pwd from user where id=?";
		boolean result = false;

		conn = JDBCUtil.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (pwd.equals(rs.getString("pwd")))
					result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return result;
	}
}
