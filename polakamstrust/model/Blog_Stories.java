package com.polakams.polakamstrust.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Blog_Stories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String title;
	String blogger_name;
	String description;
	String created_by;
	String image_url;
	@JsonFormat(pattern="yyyy-MM-dd")
	Date create_date;
	
	
	@Override
	public String toString() {
		return "Blog_Stories [id=" + id + ", title=" + title + ", blogger_name=" + blogger_name + ", description="
				+ description + ", created_by=" + created_by + ", image_url=" + image_url + ", create_date="
				+ create_date + "]";
	}
	public Blog_Stories(){
		
	}
	public Blog_Stories(int id, String title, String blogger_name, String description, String created_by,
			String image_url, Date create_date) {
		super();
		this.id = id;
		this.title = title;
		this.blogger_name = blogger_name;
		this.description = description;
		this.created_by = created_by;
		this.image_url = image_url;
		this.create_date = create_date;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBlogger_name() {
		return blogger_name;
	}
	public void setBlogger_name(String blogger_name) {
		this.blogger_name = blogger_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}	


}
