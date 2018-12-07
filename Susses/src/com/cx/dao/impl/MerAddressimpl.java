package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cx.dao.IMerAddress;
import com.cx.entity.MerAddress;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;

public class MerAddressimpl implements IMerAddress{

	@Override
	@SuppressWarnings("all")
	public List<MerAddress> findAll() {
		// TODO 自动生成的方法存根
		return (List<MerAddress>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "select * from tbl_merAddress";
				PreparedStatement pst = conn.prepareStatement(sql);
				
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<MerAddress> list = new ArrayList<>();
				
				while(rs.next()) {
					
					MerAddress s = new MerAddress();
					
					Integer mAId = rs.getInt("mAId");
					
					s.setmAId(mAId);
					
					list.add(s);
				}
				return list;
			}
		});
		
	}

	@Override
	public void save(MerAddress meraddress) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "insert into tbl_merAddress values(?,?,?,?,?,?,?)";
				
				PreparedStatement pst = conn.prepareStatement(sql);
				
				pst.setInt(1, meraddress.getmAId());
				return pst;
			}
		});
	}

}
