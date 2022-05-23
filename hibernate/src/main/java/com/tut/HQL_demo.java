package com.tut;

import java.util.List;

import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;

public class HQL_demo {
	public static void main(String []args) {
		
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		//s.beginTransaction();
		
		/*select
		     String select_query="select * from student where firstname=:X";
		     Scanner sc=new Scanner(System.in);
		     String temp=sc.nextLine();
		     Query q1=s.createQuery(select_query);
		     q1.setParameter("X", temp);
		     List<Student> l=
		     

		    for(Student st:l) {
		    	System.out.println(st.getFirstname()+" "+st.getSurname());
		    }
		    s.getTransaction().commit();*/
		    
		 //update
		    
		    Transaction tx=s.beginTransaction(); //open transaction
		     String update_query="update Student set Firstname='shreya' where firstname='abc'";
		     Query q2=s.createQuery(update_query);
		     Integer r=q2.executeUpdate();
		     System.out.println("Records updated:"+r);
		     s.getTransaction().commit();
		     
		     
		 //delete
		     Transaction tx1=s.beginTransaction();
		     String deletequery="delete Student where firstname='pqr'";
		     Query q3=s.createQuery(deletequery);
		     Integer r1=q3.executeUpdate();
		     System.out.println("Records Deleted:"+r1);
		     s.getTransaction().commit();
		     //sc.close();
	}
	
}