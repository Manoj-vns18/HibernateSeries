package com.hibernate.practice;
import javax.transaction.*;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien st=new Alien();
    	family fm=new family();
    	
    	fm.setCity("vari");
    	fm.setDob(new Date());
    	fm.setFname("hanuman");
    	fm.setIsopen(false);
    	
    	//GeneratedValue will increase primary key automatically by default for family entity
    	
    	
    	st.setName("maji");
    	st.setNoId(32);
    	st.setPlanet("mar");
    	
    	
    	 
    //first make session factory object that open session and configure with hibernate cfg xml
 SessionFactory sf=new Configuration().configure().buildSessionFactory();
    
 // after making session object now open seesion
    Session sec= sf.openSession();
    
    //family fam=(family)sec.get(family.class,1);
    //System.out.print(fam);
    
    //transaction is used data should follow  acid data base rule before saving data
    sec.beginTransaction();
     sec.save(st);
     sec.save(fm);
     //sec.save(st1);
     //commit is used for store in table
     sec.getTransaction().commit();
     sec.close();
    
    }
}
