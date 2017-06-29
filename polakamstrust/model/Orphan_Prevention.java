package com.polakams.polakamstrust.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orphan_Prevention {

	String preventionideas;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	int status;
	
	public int getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPreventionideas() {
		return preventionideas;
	}

	public void setPreventionideas(String preventionideas) {
		this.preventionideas = preventionideas;
	}
	

	public Orphan_Prevention(String preventionideas, int id, int status) {
		super();
		this.preventionideas = preventionideas;
		this.id = id;
		this.status = status;
	}

	public Orphan_Prevention(String preventionideas, int id) {
		super();
		this.preventionideas = preventionideas;
		this.id = id;
	}

	public Orphan_Prevention() {
		super();
		
	}
	
}