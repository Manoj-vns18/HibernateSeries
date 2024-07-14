package com.onetoonedemo;
//import javax.persistence.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class Demo {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		
		Question qs=new Question();
		qs.setQuestion("what is java");
		qs.setQid(1);
		Answer ans1=new Answer();
		ans1.setAns("programming lang");
		ans1.setAnsid(101);
		//qs.setAns(ans1);
		Question qs1=new Question();
		qs1.setQuestion("what is c");
		qs1.setQid(2);
		Answer ans2=new Answer();
		ans2.setAns("basic lang");
		ans2.setAnsid(102);
		qs.setAns(ans2);
		qs1.setAns(ans1);
		System.out.print(qs);
		
		
		
		
		
		
		//SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//Session ses=sf.openSession();
		System.out.print("manoj");
		ses.beginTransaction();
		ses.save(qs);
		ses.save(qs1);
		ses.save(ans1);
		ses.save(ans2);
		ses.getTransaction().commit();
		ses.close();
		
		// TODO Auto-generated method stub
		

	}

}
