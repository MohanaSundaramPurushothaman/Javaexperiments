package com.empmgt.entities;

public class Department {
	String deptId;
	String deptName;

	public Department(String deptId, String deptName) {
		this.setDeptid(deptId);
		this.setDeptname(deptName);
	}

	public String getDeptid() {
		return deptId;
	}

	public void setDeptid(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptname() {
		return deptName;

	}

	public void setDeptname(String deptName) {
		this.deptName = deptName;
	}

}
