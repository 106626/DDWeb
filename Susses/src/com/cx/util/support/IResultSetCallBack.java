package com.cx.util.support;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IResultSetCallBack {

	Object executeRscb(ResultSet rs) throws SQLException;
}
