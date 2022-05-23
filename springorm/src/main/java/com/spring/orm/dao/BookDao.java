package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Book;


public class BookDao {
	public HibernateTemplate hibernatetemp;
	@Transactional
	public int insert(Book b) {
		Integer r=(Integer) this.hibernatetemp.save(b);
		return r;
	}
	public Book getbook(int bookid) {
		Book b = this.hibernatetemp.get(Book.class,bookid);
		return b;
	}
	
	public List<Book> getallbook(){
		List<Book> loadall = this.hibernatetemp.loadAll(Book.class);
		return loadall;
	}
	@Transactional
	public void deletebook(int bookid) {
		Book db = this.hibernatetemp.get(Book.class, bookid);
		this.hibernatetemp.delete(db);
	}
	@Transactional
	public void deletebookall() {
		List<Book> loadall = this.hibernatetemp.loadAll(Book.class);
		this.hibernatetemp.deleteAll(loadall);
	}
	@Transactional
	public void updatebook(int bookid, String bname,String bgenre,String bdesc,String bauthor,int bprice) {
		Book ub = this.hibernatetemp.get(Book.class, bookid);
		ub.setBookName(bname);
		ub.setBookGenre(bgenre);
		ub.setBookDesc(bdesc);
		ub.setBookAuthor(bauthor);
		ub.setBookPrice(bprice);
		this.hibernatetemp.update(ub);
	}
	@Transactional
	public void updatebookname(int bookid, String bname) {
		Book ub = this.hibernatetemp.get(Book.class, bookid);
		ub.setBookName(bname);
		this.hibernatetemp.save(ub);
	}
	@Transactional
	public void updatebookgenre(int bookid, String bgenre) {
		Book ub = this.hibernatetemp.get(Book.class, bookid);
		ub.setBookGenre(bgenre);
		this.hibernatetemp.save(ub);
	}
	@Transactional
	public void updatebookauthor(int bookid, String bauthor) {
		Book ub = this.hibernatetemp.get(Book.class, bookid);
		ub.setBookAuthor(bauthor);
		this.hibernatetemp.save(ub);
	}
	@Transactional
	public void updatebookprice(int bookid, int bprice) {
		Book ub = this.hibernatetemp.get(Book.class, bookid);
		ub.setBookPrice(bprice);
		this.hibernatetemp.save(ub);
	}
	public HibernateTemplate getHibernatetemp() {
		return hibernatetemp;
	}

	public void setHibernatetemp(HibernateTemplate hibernatetemp) {
		this.hibernatetemp = hibernatetemp;
	}
}
