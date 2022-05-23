package com.tut;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

import org.hibernate.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        SessionFactory factory=cfg.configure().buildSessionFactory();
        System.out.println(factory);
       
       Student st=new Student();
       st.setStud_id(4);
       st.setFirstname("abc");
       st.setSurname("def");
      
       Student st1=new Student(5,"pqr","stu");
       //object creation
       //session creation
       //begin transaction
       //save
       //commit transaction
       //close session
       Address add=new Address(1,"Alandi Road","Dehu Phata","411027",(new Date()),true);
       
       Address add1=new Address();
       add1.setAddress_update(new Date());
       add1.setIspermenant(true);
       add1.setLandmark("bcd");
       add1.setPincode("90");
       add1.setStreet("pqr");
       
       Session session=factory.openSession();
       session.beginTransaction();
       session.save(st);
       session.save(st1);
       session.save(add);
       session.save(add1);
       //session.save(add1);
       
       
       session.getTransaction().commit();
       session.close();
    }
}


