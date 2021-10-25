package com.example.loginpage.createproject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;



@Entity
		@Table(name = "createProject")
		public class CreateProject implements Serializable {

		    @Id
		    @GeneratedValue(strategy = GenerationType.IDENTITY)
		    private Long id;

		    private String projectName;
		    @OneToMany(targetEntity = Employee.class,cascade = CascadeType.ALL)
		    @JoinColumn(name ="cp_fk",referencedColumnName = "id")
		    private List<Employee> employees;
		   
		    
//
//		    @OneToMany(mappedBy = "createproject", fetch = FetchType.LAZY,
//		            cascade = CascadeType.ALL)
//		    private Set<Employee> employees;
//
//
			public Long getId() {
				return id;
			}


			public void setId(Long id) {
				this.id = id;
			}


			public String getProjectName() {
				return projectName;
			}


			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}


						public List<Employee> getEmployees() {
				return employees;
			}


			public void setEmployees(List<Employee> employees) {
				this.employees = employees;
			}


						public CreateProject() {
				super();
				// TODO Auto-generated constructor stub
			}


			@Override
			public String toString() {
				return "createProject [id=" + id + ", projectName=" + projectName + ", employees=" + employees + "]";
			}
			
			
		    
}
