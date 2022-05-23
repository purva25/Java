package com.spring.orm;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.BookDao;
import com.spring.orm.entities.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext bcontext= new ClassPathXmlApplicationContext("bconfig.xml");
        BookDao bookDao= bcontext.getBean("mydao",BookDao.class);
        
        Scanner sc=new Scanner(System.in); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        		
        boolean go=true;
        while(go) {
        	System.out.println("1.Insert");
        	System.out.println("2.View a Record");
        	System.out.println("3.View all Record");
        	System.out.println("4.Delete Book");
        	System.out.println("5.DeleteAll Book");
        	System.out.println("6.Update Book");
        	System.out.println("7.Exit");
        	
        	try {
        		System.out.println("Enter choice: ");
				Integer ch=sc.nextInt();
				
				switch (ch) {
					case 1:
						System.out.println("Enter BookId: ");
						Integer id=sc.nextInt();
						System.out.println("Enter Book Name: ");
						String name=br.readLine();
						System.out.println("Enter Book Genre: ");
						String genre=br.readLine();
						System.out.println("Enter Book Description: ");
						String desc=br.readLine();
						System.out.println("Enter Book Author: ");
						String author=br.readLine();
						System.out.println("Enter Book Price: ");
						Integer price=sc.nextInt();
						Book b=new Book(id,name,genre,desc,author,price);
						int r=bookDao.insert(b);
						System.out.println("Record inserted.."+r);
						break;
					case 2:
						System.out.println("Enter bookId: ");
						Integer id1=sc.nextInt();
						Book record=bookDao.getbook(id1);
						System.out.println(" ");
						
						System.out.println("Name: "+record.getBookName());
						System.out.println("Genre: "+record.getBookGenre());
						System.out.println("Description: "+record.getBookDesc());
						System.out.println("Author: "+record.getBookAuthor());
						System.out.println("Price: "+record.getBookPrice());
						System.out.println(" ");
						break;
					case 3:				
						List<Book> allbook=bookDao.getallbook();
						for(Book bb:allbook ) {
							System.out.println("Id: "+bb.getBookId());
							System.out.println("Name: "+bb.getBookName());
							System.out.println("Genre: "+bb.getBookGenre());
							System.out.println("Description: "+bb.getBookDesc());
							System.out.println("Author: "+bb.getBookAuthor());
							System.out.println("Price: "+bb.getBookPrice());
							System.out.println(" ");
						}
						break;
					case 4:
						System.out.println("Enter book id: ");
						Integer bid=sc.nextInt();
						bookDao.deletebook(bid);
						break;
					case 5:
						bookDao.deletebookall();
						break;
					case 6:
						boolean x=true;
						while(x) {
							System.out.println("1.Update Name");
				        	System.out.println("2.Update Genre");
				        	System.out.println("3.Update Author");
				        	System.out.println("4.Update Price");
				        	System.out.println("5.Update All Fields");
							System.out.println("Enter choice: ");
							Integer ch1=sc.nextInt();
							switch(ch1) {
								case 1:
									System.out.println("Enter BookId to be updated: ");
									Integer upbookid=sc.nextInt();
									System.out.println("Enter Book Name: ");
									String upbname=br.readLine();
									bookDao.updatebookname(upbookid, upbname);
									break;
									
								case 2:
									System.out.println("Enter BookId to be updated: ");
									Integer upbookid1=sc.nextInt();
									System.out.println("Enter Book Genre: ");
									String upbgenre=br.readLine();
									bookDao.updatebookgenre(upbookid1, upbgenre);
									break;
									
								case 3:
									System.out.println("Enter BookId to be updated: ");
									Integer upbookid2=sc.nextInt();
									System.out.println("Enter Book Author: ");
									String upbauthor=br.readLine();
									bookDao.updatebookauthor(upbookid2, upbauthor);
									break;
								case 4:
									System.out.println("Enter BookId to be updated: ");
									Integer upbookid3=sc.nextInt();
									System.out.println("Enter Book Price: ");
									Integer upbprice=sc.nextInt();
									bookDao.updatebookprice(upbookid3, upbprice);
									break;
								case 5:
									System.out.println("Enter BookId to be updated: ");
									Integer uid=sc.nextInt();
									System.out.println("Enter Book Name: ");
									String uname=br.readLine();
									System.out.println("Enter Book Genre: ");
									String ugenre=br.readLine();
									System.out.println("Enter Book Description: ");
									String udesc=br.readLine();
									System.out.println("Enter Book Author: ");
									String uauthor=br.readLine();
									System.out.println("Enter Book Price: ");
									Integer uprice=sc.nextInt();
									bookDao.updatebook(uid, uname, ugenre,udesc,uauthor,uprice);
									break;
								default:
									x=false;
							}
						}
					case 7:
						go=false;
						break;						
					default:
						go=false;
						break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
        }

    }
}
