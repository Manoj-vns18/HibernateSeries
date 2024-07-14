package manytomany;
import org.hibernate.*;
import java.util.*;
import org.hibernate.cfg.Configuration;
public class demomany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session ses=fact.openSession();
		// creating 3 object for student and project
		
		student s1=new student();
		project p1=new project();
		
		student s2=new student();
		project p2=new project();
		
		student s3=new student();
		project p3=new project();
		//assigning value
		
		s1.setName("jayant");
		s1.setRollno(4);
		
		s2.setName("harsh");
		s2.setRollno(2);
		
		s3.setName("gaurav");
		s3.setRollno(6);
		
		p1.setName("hadoop");
		p1.setPid(1);
		
		p2.setName("web");
		p2.setPid(3);
		
		p3.setName("backened");
		p3.setPid(8);
		
		//creating list object for reference object project in student entity
		
		List<project> pm=new ArrayList<project>();
		pm.add(p1);
		pm.add(p2);
		
		s1.setProj(pm);
		//creating list object for reference object student  in project entity
		List<student>st1=new ArrayList<student>();
		
		st1.add(s3);
		st1.add(s2);
		
		p1.setStud(st1);
		List<student>st2=new ArrayList<student>();
		st2.add(s1);
		st2.add(s3);
		p2.setStud(st2);
		List<project> pm1=new ArrayList<project>();
		pm1.add(p1);
		pm1.add(p2);
		pm1.add(p3);
		s2.setProj(pm1);
		System.out.println("------------------------------------------------------------");
 System.out.println(s1);
		
		ses.beginTransaction();
		
		ses.save(s1);
		ses.save(p1);
		ses.save(p2);
		ses.save(p3);
		ses.save(s2);
		ses.save(s3);
		ses.save(s1);
		//ses.beginTransaction();
		ses.getTransaction().commit();
		ses.close();
		
		

	}

}
