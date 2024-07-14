package com.onetomany;
import org.hibernate.SessionFactory;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		Question q1=new Question();
		q1.setQid(11);
		q1.setQuestion("what is java");
		
		
		Answer ans1=new Answer();
		ans1.setAid(101);
		ans1.setAnswr("java is programing");
		ans1.setQuest(q1);
		
		Answer ans2=new Answer();
		ans2.setAid(111);
		ans2.setAnswr("java is secure");
		ans2.setQuest(q1);
		
		
		Answer ans3=new Answer();
		ans3.setAid(121);
		ans3.setAnswr("java is oops lang");
		ans3.setQuest(q1);
		
		
		
		List<Answer> dep1=new ArrayList<Answer>();
		dep1.add(ans1);
		dep1.add(ans2);
		dep1.add(ans3);
		q1.setAns(dep1);
		
		
		
		
		SessionFactory fact = new Configuration().configure().buildSessionFactory();
		Session ses=fact.openSession();
		Transaction ts=ses.beginTransaction();
		
		
		
		
		ses.save(q1);
		ses.save(ans1);
		ses.save(ans2);
		ses.save(ans3);
		
		
		
		ses.getTransaction().commit();
		ses.close();
		// TODO Auto-generated method stub

	}

}
