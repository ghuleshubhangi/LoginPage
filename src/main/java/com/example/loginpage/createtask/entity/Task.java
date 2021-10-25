package com.example.loginpage.createtask.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "task")
public class Task implements Serializable {
	@Id
	private String id;
	private String title;
	private String status;
	private String description;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}