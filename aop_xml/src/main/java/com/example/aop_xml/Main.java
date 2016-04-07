package com.example.aop_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop_xml.xml");
		DB mysql = (DB)ctx.getBean("mysql");
		mysql.connect();
	}
}
