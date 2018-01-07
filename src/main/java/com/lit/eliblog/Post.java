package com.lit.eliblog;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private String body;
	private Date date;

	Post(){
		
	}
	
	Post(String title, String body) {
		this.setTitle(title);
		this.setBody(body);

	}

	public String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	void setBody(String body) {
		this.body = body;
	}

	private long getId() {
		return id;
	}

	private void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	void setDate(Date date) {
		this.date = date;
	}
}
