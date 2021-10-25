package com.example.loginpage.task.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.loginpage.createtask.entity.Task;

//import com.springboot.example.entity.Task;

public class TaskRowMapper implements RowMapper<Task>{

	@Override
	public Task mapRow(ResultSet rs, int arg1) throws SQLException {
		Task tsk = new Task();
		tsk.setId(rs.getString("id"));
		tsk.setTitle(rs.getString("title"));
		tsk.setStatus(rs.getString("status"));
		tsk.setDescription(rs.getString("description"));
 
		return tsk;
	}
	

}
