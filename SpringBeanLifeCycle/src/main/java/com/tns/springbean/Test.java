package com.tns.springbean;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		StudentDao d1=a.getBean("d",StudentDao.class);
		d1.selectAllRows();

	}

}
