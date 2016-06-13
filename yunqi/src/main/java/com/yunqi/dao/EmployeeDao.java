package com.yunqi.dao;

import org.bson.types.ObjectId;

import com.yunqi.core.dao.IGenericDao;
import com.yunqi.model.Employee;

public interface EmployeeDao extends IGenericDao<Employee, ObjectId>{
	
}