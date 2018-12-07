package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cx.dao.IFoodTypeDao;
import com.cx.entity.FoodType;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;

public class FoodTypeDaoimpl implements IFoodTypeDao{
	@SuppressWarnings("all")
	@Override
	public List<FoodType> findAll() {
		// TODO 自动生成的方法存根
		return (List<FoodType>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql="select * from tb_foodType";
				
				PreparedStatement pst=conn.prepareStatement(sql);
				
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<FoodType> list=new ArrayList<>();
				
				while(rs.next()){
					FoodType s = new FoodType();
					
					Integer id = rs.getInt("addressId");
					
								
					s.setfTId(id);
					
					
					list.add(s);
				}
				return null;
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
			
			String sql="delete from tb_useraddress where m_id=?";
			
			PreparedStatement pst=conn.prepareStatement(sql);
			
			pst.setInt(1,id);
			
			return pst;
		}
	});
	}

}
