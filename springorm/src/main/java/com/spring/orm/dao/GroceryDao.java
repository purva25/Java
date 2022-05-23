package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Grocery;

public class GroceryDao {
	private HibernateTemplate hibertemp;
	@Transactional
	public int insert(Grocery g) {
		Integer i=(Integer)this.hibertemp.save(g);
		return i;
	}
	public Grocery getrecord(int id) {
		Grocery g=this.hibertemp.get(Grocery.class, id);
		return g;
	}
	public List<Grocery> getallrecord() {
		List<Grocery> loadall=this.hibertemp.loadAll(Grocery.class);
		return loadall;
	}
	
	@Transactional
	public void update(int id,String name,int price) {
		Grocery ug=getrecord(id);
		ug.setName(name);
		ug.setPrice(price);
		this.hibertemp.save(ug);
	}
	@Transactional
	public void delete(int id) {
		Grocery ug=getrecord(id);
		this.hibertemp.delete(ug);
	}

	public HibernateTemplate getHibertemp() {
		return hibertemp;
	}
	

	public void setHibertemp(HibernateTemplate hibertemp) {
		this.hibertemp = hibertemp;
	}
	
	
}
