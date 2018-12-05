package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cx.dao.IMerDao;
import com.cx.entity.Admi;
import com.cx.entity.Mer;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;

public class MerDaoimpl implements IMerDao{

	@Override
	public void save(Mer mer) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "insert into tbl_mer values(tbl_mer_m_id.nextval,?,?,?,?,?,?)";
				
				PreparedStatement pst = conn.prepareStatement(sql);
				
				pst.setString(1, mer.getmName());
				pst.setString(2, mer.getmPassword());
				pst.setString(3, mer.getmPhone());
				pst.setString(4, mer.getmImg());
				
				
				return pst;
			}
		});
	}

	@Override
	@SuppressWarnings("all")
	public List<Mer> findAll(String mName) {
		// TODO 自动生成的方法存根
		return (List<Mer>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql = "select * from tbl_mer ";
				
				PreparedStatement pst = conn.prepareStatement(sql);
				
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<Mer> list = new ArrayList<>();
				
				while(rs.next()) {
					Mer s = new Mer();
					
					Integer mId = rs.getInt("mId");
					String mName = rs.getString("mName");
					String mPassword = rs.getString("mPassword");
					String mPhone = rs.getString("mPhone");
					String mImg = rs.getString("mImg");
					Date mStartTime= rs.getDate("mStartTime");
					Date mEndTim = rs.getDate("mEndTim");
					
					s.setmId(mId);
					s.setmName(mName);
					s.setmPassword(mPassword);
					s.setmPhone(mPhone);
					s.setmImg(mImg);
					s.setmStartTime(mStartTime);
//					s.setmEndTime(mEndTime);
					
					list.add(s);
				}
				return list;
			}
		});
		
	}

}
