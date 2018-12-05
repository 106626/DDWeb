package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cx.dao.IFoodDao;
import com.cx.entity.Food;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;

public class FoodDaoimpl implements IFoodDao{

	@Override
	@SuppressWarnings("all")
	public List<Food> findAll() {
		// TODO 自动生成的方法存根
		return (List<Food>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "select * from tbl_food";
				
				PreparedStatement pst = conn.prepareStatement(sql);
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<Food> list = new ArrayList<>();
				
				while(rs.next()) {
					Food s = new Food();
					
					Integer fId = rs.getInt("fId");
					String fName = rs.getString("fName");
					double fPrice = rs.getDouble("fPrice");
					String fImg = rs.getString("fImg");
					
					s.setfId(fId);
					s.setfName(fName);
					s.setfPrice(fPrice);
					s.setfImg(fImg);
					
					list.add(s);
				}
				return list;
			}
		});
		
	}

	@Override
	public void save(Food food) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "insert into tbl_food values(tbl_food_f_id.nextval,?,?,?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, food.getfName());
				pst.setDouble(2, food.getfPrice());
				pst.setString(3, food.getfImg());
				
				return pst;
			}
		});
	}

	@Override
	public void delById(Integer fId) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "delete from tbl_food where id = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, fId);
				return pst;
			}
		});
		
	}

}
