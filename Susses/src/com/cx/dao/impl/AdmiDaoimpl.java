package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cx.dao.IAdmiDao;
import com.cx.entity.Admi;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;

@SuppressWarnings("all")
public class AdmiDaoimpl implements IAdmiDao{

	@Override
	public List<Admi> findAll() {
		// TODO 自动生成的方法存根
		return (List<Admi>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "select * from tb_admi";
				PreparedStatement pst = conn.prepareStatement(sql);
				return pst;
			}
		}, new IResultSetCallBack() {	
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<Admi> list = new ArrayList<>();
				
				while(rs.next()){
					Admi s = new Admi();
					
					Integer id = rs.getInt("admi_id");
					
					String name = rs.getString("admi_name");
								
					s.setAdmiID(id);
					
					s.setAdmiName(name);
					
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
				String sql = "insert into tb_Admi values(?,?,?)";
				
				PreparedStatement pst = conn.prepareStatement(sql);
				//发送参数 - 注意类型
				//pst.setInt(1, star.getId());
				pst.setInt(1, admi.getAdmiID());
				
				pst.setString(2, admi.getAdmiName());
						
				pst.setString(3, admi.getAdmiPassword());
				
				return pst;
			}
		});
	}

}
