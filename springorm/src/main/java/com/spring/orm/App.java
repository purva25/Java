package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.GroceryDao;
import com.spring.orm.entities.Grocery;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
    	GroceryDao grocerydao=c.getBean("mydao",GroceryDao.class);
    	
    	Scanner sc=new Scanner(System.in);
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	boolean c=true;
    	while(c) {
    		System.out.println("1.Insert");
    		System.out.println("1.get");
    		System.out.println("1.getall");
    		System.out.println("1.update");
    		System.out.println("1.delete");
    		System.out.println("Enter your choice: ");
    		int ch=sc.nextInt();
    		switch (ch) {
			case 1:
				System.out.println("Enter id: ");
				int id=sc.nextInt();
				System.out.println("Enter name: ");
				String name=br.readLine();
				System.out.println("Enter price: ");
				int price=sc.nextInt();
				Grocery g1=new Grocery(id,name,price);
				int i=grocerydao.insert(g1);
				break;
			case 2:
				System.out.println("Enter id: ");
				int id1=sc.nextInt();
				
				break;

			default:
				c=false;
			}
    	}
    	
        System.out.println("Inserted "+r );
    }
}
