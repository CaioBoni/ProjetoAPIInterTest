package br.com.projetointertest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="JOB")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "id")
public class Job {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="NAME", length=100, nullable=false)
	private String name;
	
	@Column(name="REQUIRED")
	private boolean required;
	
	@OneToMany
	private List<Task> tasks;
	
	@ManyToOne(cascade={CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name="PARENT_JOB", referencedColumnName = "id", nullable=true)
	private Job parentJob;
	
	public Job() {
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public Job getParentJob() {
		return parentJob;
	}
	public void setParentJob(Job parentJob) {
		if(parentJob.getId() != this.id)
			this.parentJob = parentJob;
		else
			System.out.println("Não foi possível atribuir Parent. Referência circular.");
	}
}