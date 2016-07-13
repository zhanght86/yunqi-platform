package com.yunqi.apis.org.service.impl;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunqi.apis.org.dao.DepartmentDao;
import com.yunqi.apis.org.domain.Department;
import com.yunqi.apis.org.service.DepartmentService;
import com.yunqi.core.dao.IGenericDao;
import com.yunqi.core.service.GenericService;

/**
 * @author zhangguosheng
 */
@Service("departmentService")
public class DepartmentServiceImpl extends GenericService<Department, ObjectId> implements DepartmentService{

	@Autowired
	private DepartmentDao dao;
	
	@Override
	public IGenericDao<Department, ObjectId> getDao() {
		return dao;
	}
	
}