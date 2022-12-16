package com.sprinORM.practice;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.dao.accountsDao;
import com.springORM.entity.accounts;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      accountsDao adao = (accountsDao)context.getBean("accountsDao");
      
      accounts accounts = new accounts();
      accounts.setCallid(108867565);
      accounts.setChannel("UKH");
      accounts.setCreatedtimestamp(new Date());
      
      adao.insert(accounts);	
      
     
        
        
    }
}
