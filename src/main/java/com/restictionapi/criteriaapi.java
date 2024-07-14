package com.restictionapi;
import java.util.Arrays;
import java.util.List;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manytomany.project;
import manytomany.student;

public class criteriaapi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session ses=fact.openSession();
		Criteria crit=ses.createCriteria(student.class);
		List<student> list=crit.list();
		for(student stud:list)
		{
		//crit.add(null)
			System.out.println(stud.getName());

	}

}}
