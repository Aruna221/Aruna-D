package com.cts.springmvc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.springmvc.entity.Product;

@Repository//marker for persistence layer
public class ProductDAOImpl
{

	@Autowired
	SessionFactory sessionFactory;//dispatcher-servlet.xm

	public void createProduct(Product product) {
		Session session = sessionFactory.openSession();
		session.save(product);//persist hibernate
		System.out.println("Record Inserted");
		session.close();
	}
	
	public List<Product> getProduct() 
	{
		//get the hibernate session
		Session session = sessionFactory.openSession();
		//create a query.. sort by lastName
	//sorting the record by name 	
		Query theQuery = session.createQuery("from Product order by username");
		List<Product> e1 = theQuery.list();
		return e1;
	}
	public void deleteEmp(long theId)
	{
		Session session = sessionFactory.openSession();
		//:abc runtime variable
		Query theQuery = session.createQuery("delete from Product where id=:abc");
		theQuery.setParameter("abc", theId);
		theQuery.executeUpdate();
		
	}
	public void updateEmp(long theId)
	{
		Session session = sessionFactory.openSession();
		//:abc runtime variable
		Query theQuery = session.createQuery("update from Product where id=:abc");
		theQuery.setParameter("abc", theId);
		theQuery.executeUpdate();
	}
	  public boolean checkLogin(String userName, String userPassword){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			boolean userFound = false;
			//Query using Hibernate Query Language
			String SQL_QUERY =" from Product as o where o.username=? and o.password=?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0,userName);//first ?
			query.setParameter(1,userPassword);//second ?
			List list = query.list();

			if ((list != null) && (list.size() > 0)) {
				userFound= true;
			}

			session.close();
			return userFound;              
     }







public boolean checkSearch(Long Id){
	System.out.println("In Check search");
	Session session = sessionFactory.openSession();
	boolean userFound = false;
	//Query using Hibernate Query Language
	String SQL_QUERY =" from Product as o where o.id=?";
	Query query = session.createQuery(SQL_QUERY);
	query.setParameter(0,Id);//first ?
	List list = query.list();

	if ((list != null) && (list.size() > 0)) {
		userFound= true;
	}

	session.close();
	return userFound;              
}
}
