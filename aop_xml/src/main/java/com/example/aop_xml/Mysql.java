package com.example.aop_xml;

public class Mysql implements DB
{
	@Override
	public void connect() 
	{
		System.out.println("mysql...");	
	}	
}
