package com.empmgt.entities;

public class Developer extends Employee {
	public String Language;

	public Developer(int id, String name, Department department, String Language) {
		super(id, name, department);
		this.setLanguage(Language);
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String Language) {
		this.Language = Language;
	}

}
