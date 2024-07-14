package com.hibernate.practice;

import org.hibernate.SessionFactory;
import javax.transaction.*;
import java.util.Date;
import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class Embded_example {

	public static void main(String[] args) {
		//SessionFactory session=new Configuration().configure().buildSessionFactory();
		//Session sc=session.openSession();
		embeded_entity emb=new embeded_entity();
		emb.setRoll(1);
		emb.setName("lalita");
		emb.setPlace("varanasi");
		
		
		 embded_object ebo=new embded_object();
		ebo.setEmdInt(10);
		ebo.setLocation("kolkata");
		emb.setEmp(ebo);
		System.out.print(emb);
		
		SessionFactory session=new Configuration().configure().buildSessionFactory();
		Session sc=session.openSession();
		sc.beginTransaction();
		sc.save(emb);
		
		sc.getTransaction().commit();
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
