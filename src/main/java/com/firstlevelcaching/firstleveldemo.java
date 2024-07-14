package com.firstlevelcaching;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manytomany.student;

import java.util.Arrays;
import java.util.List;

import org.hibernate.*;
public class firstleveldemo {

	public static void main(String[] args) {
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session ses=fact.openSession();
		//first time creating object of student id =2
		student stud =ses.get(student.class,2);
		System.out.println(stud.getName()+""+stud.getRollno());
		//second time creating object of student id =2
		student stud1 =ses.get(student.class,2);
		System.out.println(stud1.getName()+""+stud1.getRollno());
		
   //        you can see in output console....
   //		only one time sql query run for making object,not for second time 
  //		bcz after first time memory got saved in cache memory
		
         ses.close();
         fact.close();
	}

}
