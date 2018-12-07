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

public class UserDaoimpl implements IUserDao{

	@Override
	public void save(User user) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				
				String sql="insert into tb_user values(tb_user_u_id.nextval,?,?,?,null,null,null,null)";
				
				PreparedStatement pst=conn.prepareStatement(sql);
				
				//发送参数-注意类型
				//pst.setInt(1, user.getuId());
				
				pst.setString(1, user.getuPhone());
				
				pst.setString(2, user.getuName());
				
				pst.setString(3, user.getuPassword());
								
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
				List<User> list=new ArrayList<>();
				
				while(rs.next()){
					Integer uId=rs.getInt("u_id");
					
					String uName=rs.getString("u_name");
					
					String uPhone=rs.getString("u_phone");
					
					String uPassword=rs.getString("u_password");
					
//					char sex=rs.getString("u_sex").charAt(0);
					
					User user=new User();
					
					user.setuId(uId);
					
					user.setuName(uName);
					
					user.setuPhone(uPhone);
					
					user.setuPassword(uPassword);
					
//					user.setSex(sex);
					
					list.add(user);
				}
				
				return list;
			}
		});
	}
	@Override
	@SuppressWarnings("all")
	public List<User> findAll(String uName, String uPassword) {
		// TODO 自动生成的方法存根
		return (List<User>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				
				String  sql="select * from tb_user where 1=1";
				
				if(null!=uName&&uName.trim().length()>0){
					sql+=" and u_name like '%"+uName+"%'";
				}
				
				if(null!=uPassword){
					sql+="and uPassword ="+uPassword;
				}
				
				PreparedStatement pst=conn.prepareStatement(sql);
				
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
					List<User> list = new ArrayList<>();			
					while(rs.next()){
						Integer uId=rs.getInt("u_id");
						
						String uName=rs.getString("u_name");
						
						String uPhone=rs.getString("u_phone");
						
						String uPassword=rs.getString("u_password");
						
						User user=new User();
						
						user.setuId(uId);
						
						user.setuName(uName);
						
						user.setuPhone(uPhone);
						
						user.setuPassword(uPassword);
						
						list.add(user);

					}			
					
				return list;
			}
		});
	}

	@Override
	public void delById(Integer id) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql1="delete from tb_FO where fo_ord_id=?";
				
				PreparedStatement pst1=conn.prepareStatement(sql1);
				
				pst1.setInt(1, id);
				
				return pst1;
			}
		});
	}

}
