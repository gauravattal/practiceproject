package com.springORM.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class customersDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

}
