package com.springORM.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.springORM.entity.accounts;

@Component
public class accountsDao {
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public Long insert(accounts accounts)
	{
		
   Long i = (Long) this.hibernateTemplate.save(accounts);
		return i;
	}

}
