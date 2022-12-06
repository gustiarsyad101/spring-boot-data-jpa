package com.springbootdatajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class ModelTutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

//	@Column(name = "published")
//	private boolean published;

	public ModelTutorial() {

	}

	public ModelTutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + "]";
	}

}
