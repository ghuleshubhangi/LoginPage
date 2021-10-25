package com.example.loginpage.task.dao;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.example.loginpage.createtask.entity.Task;
import com.example.loginpage.task.mapper.TaskRowMapper;

//import com.springboot.example.entity.Task;
//import com.springboot.example.mapper.TaskRowMapper;

@Repository
public class TaskDaoImpl implements TaskDao {
	
	public TaskDaoImpl(NamedParameterJdbcTemplate template) {  
        this.template = template;  
}  
	NamedParameterJdbcTemplate template; 
	

	@Override
	public List<Task> findAll() {		
		return template.query("select * from task", new TaskRowMapper());
	}

	@Override
	public void insertTask(Task tsk) {
		final String sql = "insert into task(id, title ,status, description) values(:id,:title,:status,:description)";
		 
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
				.addValue("id", tsk.getId())
				.addValue("title", tsk.getTitle())
				.addValue("status", tsk.getStatus())
				.addValue("description", tsk.getDescription());
				
        template.update(sql,param, holder);
		
	}

	@Override
	public void updateTask(Task tsk) {
	
		final String sql = "update task set title=:title,status=:status, description=:description where id=:id";
		 
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
				.addValue("id", tsk.getId())
				.addValue("title", tsk.getTitle())
				.addValue("status", tsk.getStatus())
				.addValue("description", tsk.getDescription());
				
        template.update(sql,param, holder);
	}

	@Override
	public void executeUpdateTask(Task tsk) {
		final String sql = "update task set title=:title,status=:status, description=:description where id=:id ";
		 

		 Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("id", tsk.getId());
		 map.put("title", tsk.getTitle());
		 map.put("status", tsk.getStatus());
		 map.put("description", tsk.getDescription());
		
	
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
			});  

	 
		
	}

	@Override
	public void deleteTask(Task tsk) {
		final String sql = "delete from task where id=:id";
		 

		 Map<String,Object> map=new HashMap<String,Object>();  
		 map.put("id", tsk.getId());
	
		 template.execute(sql,map,new PreparedStatementCallback<Object>() {  
			    @Override  
			    public Object doInPreparedStatement(PreparedStatement ps)  
			            throws SQLException, DataAccessException {  
			        return ps.executeUpdate();  
			    }  
			});  

		
	}
	

}