package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cx.dao.IUserDao;
import com.cx.entity.User;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;
import com.sun.crypto.provider.RSACipher;

public class UserDaoimpl implements IUserDao{

	@Override
	public void save(User user) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				
				String sql="insert into tb_user values(?,?,?,?,?,?,?,?)";
				
				PreparedStatement pst=conn.prepareStatement(sql);
				
				//发送参数-注意类型
				pst.setInt(1, user.getuId());
				
				pst.setString(2, user.getuPhone());
				
				pst.setString(3, user.getuName());
				
				pst.setString(4, user.getuPassword());
				
				pst.setString(5, String.valueOf(user.getSex()));
				
				pst.setInt(6, user.getUseraddress().getuAId());
				
				pst.setInt(7, user.getVip().getvId());
				
				pst.setInt(8, user.getImg().gethId());
				
				return pst;
			}
		});
	}

	@Override
	@SuppressWarnings("all")
	public List<User> findAll() {
		// TODO 自动生成的方法存根
		return (List<User>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				
				String sql="select * from tb_user";
				
				PreparedStatement pst=conn.prepareStatement(sql);
				
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<User> list = new ArrayList<>();
				
				while(rs.next()) {
					User s = new User();
					
					Integer uId = rs.getInt("uId");
					String uName = rs.getString("uName");
					String uPhone = rs.getString("uPhone");
					String uPassword = rs.getString("uPassword");
					char sex = rs.getString("sex").charAt(0);
					
					s.setuId(uId);
					s.setuName(uName);
					s.setuPhone(uPhone);
					s.setuPassword(uPassword);
					s.setSex(sex);
					
					list.add(s);
					
				}
				
				
				return list;
			}
		});
	}

	@Override
	public void delById(Integer Id) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				
				String sql="delete from tb_user where id=?";
				
				PreparedStatement pst=conn.prepareStatement(sql);
				
				pst.setInt(1, Id);
				
				return pst;
			}
		});
	}

	@Override
	@SuppressWarnings("all")
	public List<User> findAll(String uName, Integer uAId) {
		// TODO 自动生成的方法存根
		return (List<User>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				
				String  sql="select * from tb_user where 1=1";
				
				if(null!=uName&&uName.trim().length()>0){
					sql+="and uName like '%"+uName+"%'";
				}
				
				if(null!=uAId){
					
				}
				
				PreparedStatement pst=conn.prepareStatement(sql);
				
				return null;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				while(rs.next()){
					
				}
				return null;
			}
		});
	}

}
