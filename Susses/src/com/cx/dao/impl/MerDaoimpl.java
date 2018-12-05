package com.cx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cx.dao.IMerDao;
import com.cx.entity.Mer;
import com.cx.util.support.IPreparedStatementCallBack;
import com.cx.util.support.IResultSetCallBack;
import com.cx.util.support.JdbcTemplate;

public class MerDaoimpl implements IMerDao{
	@Override
	@SuppressWarnings("all")
	public List<Mer> findAll(String mName,Integer mA_id) {
		// TODO 自动生成的方法存根
		return (List<Mer>) JdbcTemplate.exetuteQuery(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				String sql="select * from tb_Mer where 1=1";
				if(null!=mName && mName.trim().length()>0){
					sql+=" and name like '%"+mName+"%'";
				}
				
				if(null!=mA_id){
					sql+=" and area_id="+mA_id;
				}
				
				PreparedStatement pst = conn.prepareStatement(sql);
				return pst;
			}
		}, new IResultSetCallBack() {
			
			@Override
			public Object executeRscb(ResultSet rs) throws SQLException {
				// TODO 自动生成的方法存根
				List<Mer> list=new ArrayList<>();
				
				while(rs.next()){
					Integer id=rs.getInt("m_id");
					
					String name=rs.getString("m_name");
					
					String phone=rs.getString("m_phone");
					
					Date starttime=rs.getDate("m_startTime");
					
					Date endtime=rs.getDate("m_endTime");
					
					Mer s=new Mer();
					
					s.setmId(id);
					
					s.setmName(name);
					
					s.setmPhone(phone);
					
					s.setmStartTime(starttime);
					
					s.setmEndTime(endtime);
			
				}
				
				return list;
			}
		});
	}

	@Override
	public void save(Mer mer) {
		// TODO 自动生成的方法存根
		JdbcTemplate.execute(new IPreparedStatementCallBack() {
			
			@Override
			public PreparedStatement executePst(Connection conn) throws SQLException {
				// TODO 自动生成的方法存根
				
				String sql="insert into tb_user values(tb_mer_m_id.nextval,?,?,?,?,?,null,null,null)";
				
				PreparedStatement pst=conn.prepareStatement(sql);
				
				//发送参数-注意类型
				//pst.setInt(1, user.getuId());
				
				pst.setString(1, mer.getMertype().getMtName());
				
				pst.setString(2, mer.getmName());
				
				pst.setString(3, mer.getmPassword());
				
				pst.setInt(4, mer.getMeraddress().getmAId());
				
				pst.setString(5, mer.getmImg());
										
				return pst;
			}
		});
	}
}

