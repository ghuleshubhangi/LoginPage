package com.example.loginpage.task.service;


import java.util.List;

import com.example.loginpage.createtask.entity.Task;


//import com.springboot.example.entity.Task;

public interface TaskService {
	List<Task> findAll();

	void insertTask(Task tsk);

	void updateTask(Task tsk);

	void executeUpdateTask(Task tsk);

	void deleteTask(Task tsk);

}
