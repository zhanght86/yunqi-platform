package com.yunqi.apis.org.dao.impl;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import com.yunqi.apis.org.dao.DepartmentDao;
import com.yunqi.apis.org.domain.Department;
import com.yunqi.core.dao.GenericDao;

@Service("departmentDao")
public class DepartmentDaoImpl extends GenericDao<Department, ObjectId> implements DepartmentDao{

}