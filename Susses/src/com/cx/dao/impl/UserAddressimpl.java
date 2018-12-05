package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cx.dao.IUserAddress;
import com.cx.entity.Mer;
import com.cx.entity.UserAddress;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;

public class UserAddressimpl implements IUserAddress{

	@Override
	@SuppressWarnings("all")
	public List<UserAddress> findAll() {
		// TODO 自动生成的方法存根
		return (List<UserAddress>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "select * from tbl_userAddress";
				PreparedStatement pst = conn.prepareStatement(sql);
				
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<UserAddress> list = new ArrayList<>();
				
				while(rs.next()) {
					UserAddress s = new UserAddress();
					
					Integer uAId = rs.getInt("uAId");
					
					list.add(s);
				}
				return list;
			}
		});
		
	}

	@Override
	public void save(UserAddress useraddress) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "insert into tbl_star values(?,?,?,?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				
				pst.setInt(1, useraddress.getuAId());
				
				return pst;
			}
		});
	}

}
