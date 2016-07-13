package com.yunqi.apis.org.domain;

import java.util.Date;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.yunqi.apis.org.domain.enums.EmployeeState;
import com.yunqi.apis.org.domain.enums.SexType;
import com.yunqi.core.entity.MongoEntity;

/**
 * 账号.
 */
@Document
public class Employee extends MongoEntity<Employee>{

	private static final long serialVersionUID = -652620350809791323L;
	private String name;
	@DBRef
	private Company company;
	@DBRef
	private Set<Department> departments;
	private Date birthday;
	private String email;
	private String icon;
	private SexType sex;
	private String telNo;
	private Long userId;
	private EmployeeState state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Set<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public SexType getSex() {
		return sex;
	}
	public void setSex(SexType sex) {
		this.sex = sex;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public Long getUser() {
		return userId;
	}
	public void setUser(Long userId) {
		this.userId = userId;
	}
	public EmployeeState getState() {
		return state;
	}
	public void setState(EmployeeState state) {
		this.state = state;
	}
	
}