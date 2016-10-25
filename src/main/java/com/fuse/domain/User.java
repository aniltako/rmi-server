package com.fuse.domain;

public class User {

	private long id;
	private String name;
	private String surname;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override

	public String toString() {

		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Id : ").append(getId());
		strBuilder.append(", Name : ").append(getName());
		strBuilder.append(", Surname : ").append(getSurname());
		return strBuilder.toString();

	}

}
