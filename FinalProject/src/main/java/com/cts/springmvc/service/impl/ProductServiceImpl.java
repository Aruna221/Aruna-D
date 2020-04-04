package com.cts.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.springmvc.dao.impl.ProductDAOImpl;
import com.cts.springmvc.entity.Product;

//SERVICE IS THE MIDDLE LAYER
@Service//get from @repository and connects to @controller
@Transactional//database transaction
public class ProductServiceImpl {
    @Autowired
    private ProductDAOImpl productDAO;
    
    public void createProduct(Product product) 
    {
    
        
        productDAO.createProduct(product);
            
    
        
    }
    
    @Transactional
    public List<Product> getemps() 
    {
        
        return productDAO.getProduct();
    }
    @Transactional
    public void deleteemps(long theId)
    {
        productDAO.deleteEmp(theId);
    }
    @Transactional
    public void updateemps(long theId)
    {
        productDAO.updateEmp(theId);
    }
    //call controller
    public boolean checkLogin(String userName, String userPassword){
        System.out.println("In Service class...Check Login");
        return productDAO.checkLogin(userName, userPassword);
        }
    
    
    
    
    
    
    public boolean checkSearch(Long Id){
        System.out.println("In Service class...Check Search");
        return productDAO.checkSearch(Id);
/*
    @Override
    public Employee getEmployee(Employee employee) {
        //
        //
        //
        return employeeDAO1.getEmployee(employee);
    }
    
    */
    
    
    }}
