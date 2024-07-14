package com.hqlpractise;
import java.util.*; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.onetomany.*;
import manytomany.*;

public class hqldemo {

	public static void main(String[] args) {
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session ses=fact.openSession();
		
		
		ses.beginTransaction();
		//query for selecting variable
//		String q="from student";
//		Query query=ses.createQuery(q);
//		List<student> list=query.list();
//		for(student std:list)
//			System.out.println(std.getRollno()+""+std .getName());
		
		//query for selecting variable
//				String q1="from student where rollno ='44' ";
//				Query query1=ses.createQuery(q1);
//				List<student> list1=query1.list();
//				for(student std1:list1)
//					System.out.println(std1 .getName());
				
//				//query for delete
//				Query qr=ses.createQuery("delete from student where name ='jayant'");
//				int r=qr.executeUpdate();
//				System.out.println(r);
				//query for delete
				Query qr2=ses.createQuery("select d.did,d.dname,e1.depart from department as d INNER JOIN  d.emp as e1");
				List<Object[]> list = qr2.getResultList();
				for(Object[] ob:list)
				    System.out.println(Arrays.toString(ob));
		
		ses.getTransaction().commit();
		ses.close();
		fact.close();
	}

}
