package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cx.dao.IUserDao;
import com.cx.entity.User;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;
import java.util.*;
public class IUserDaoimpl implements IUserDao{

	@Override
	public void save(User user) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	@SuppressWarnings("all")
	public List<User> findAll() {
		// TODO 自动生成的方法存根
		return (List<User>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql="select * from TB_USER";
				
				PreparedStatement pst=conn.prepareStatement(sql);
				
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<User> list =new ArrayList<>();
				while(rs.next()){
					Integer uId=rs.getInt("u_id");
					String uPhone=rs.getString("u_phone");
					String uPassword=rs.getString("u_password");
					String uName=rs.getString("u_name");					
					User user=new User();
					user.setuId(uId);
					user.setuPhone(uPhone);
					user.setuName(uName);
					user.setuPassword(uPassword);
					list.add(user);	
				}
				return list;
			}
		});
	}

	@Override
	public void delById(Integer Id) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public List<User> findAll(String uName, Integer uAId) {
		// TODO 自动生成的方法存根
		return null;
	}
	
}
