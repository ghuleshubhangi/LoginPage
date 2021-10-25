package com.example.loginpage.task.dao;
import java.util.List;

import com.example.loginpage.createtask.entity.Task;




public interface TaskDao {
	List<Task> findAll();

	void insertTask(Task tsk);

	void updateTask(Task tsk);

	void executeUpdateTask(Task tsk);

	public void deleteTask(Task tsk);

}
