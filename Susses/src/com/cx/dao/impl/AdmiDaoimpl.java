package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cx.dao.IAdmiDao;
import com.cx.entity.Admi;
import com.cx.entity.Food;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;

public class AdmiDaoimpl implements IAdmiDao{
	@Override
	@SuppressWarnings("all")
	public List<Admi> findAll() {
		return (List<Admi>)	JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql="select * from tbl_admi";
				PreparedStatement pst = conn.prepareStatement(sql);
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<Admi> list = new ArrayList<>();
				
				while(rs.next()) {
					Admi s = new Admi();
					
					Integer admiID = rs.getInt("admi_id");
					String admiName = rs.getString("admi_name");
					String admiPassword = rs.getString("admi_password");
					
					s.setAdmiID(admiID);
					s.setAdmiName(admiName);
					s.setAdmiPassword(admiPassword);
					
					list.add(s);
				}
				
				return list;
			}
		});
		
	}

	@Override
	public void save(Admi admi) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "insert into tbl_Admi values(tbl_Admi_admiID.nextval,?,?,?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				
				pst.setString(1, admi.getAdmiName());
				pst.setString(2, admi.getAdmiPassword());
				
//				pst.setInt(3, admi.get);
				
				return pst;
			}
		});
	}
	
}
