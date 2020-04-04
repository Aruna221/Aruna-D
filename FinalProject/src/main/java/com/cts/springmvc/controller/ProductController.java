package com.cts.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.cts.EmployeeBean;
import com.cts.springmvc.entity.Product;
import com.cts.springmvc.service.impl.ProductServiceImpl;

@Controller
public class ProductController {

	@Autowired
	private ProductServiceImpl productService1;
	@RequestMapping("callproj")
	public String createUser1(Model m) 
	{	
		//product attribute==modelattribute in register.jsp
		m.addAttribute("product",new Product());
		return "register";//register.jsp==form action=register
	}
/*	
	@RequestMapping(value = "loginsucess", method = RequestMethod.GET)
	public String views(@ModelAttribute Product product1,Model m)
	{
		List<Product> obj=productService1.getemps();
		m.addAttribute("emps",obj);//emps can beaccessin ViewEmp.jsp
			return "view";//ViewEmp.jsp
	}
*/	//insertion
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String createUser(@ModelAttribute Product product1,Model m)
	{
		productService1.createProduct(product1);//save(employee)
		 return "registersuceess"; //redirect to request pattern::view
	       }
	//sucess
	//selection
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute Product product1,Model m)
	{
		List<Product> obj=productService1.getemps();
		m.addAttribute("emps",obj);//emps can beaccessin ViewEmp.jsp
			return "ViewEmp";//ViewEmp.jsp
	}
	//deletion
    @RequestMapping(value="/deleteemps/{delno}",method = RequestMethod.GET)    
    public String delemp(
    		@PathVariable 
    		int delno)
    {    
        productService1.deleteemps(delno);
        return "redirect:/view"; //call req pattern /view
        
    } 
  //Update
    @RequestMapping(value="/updateemps/{updateno}",method = RequestMethod.GET)    
    public String updateemp(
    		@PathVariable 
    		int updateno)
    {    
        productService1.updateemps(updateno);
        return "redirect:/view"; //call req pattern /view
    }

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView viewLogin(@ModelAttribute Product product) {
		return new ModelAndView("login");//login.jsp
	}


	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute Product product) 
	{
		boolean emp = productService1.checkLogin(product.getUsername(),product.getPassword());
		ModelAndView model = null;
		if (emp) 
		{
			model = new ModelAndView("loginsuccess");//loginsuccess.jsp
			model.addObject("emp", product.getUsername());//access in jsp
			
		} else {
			model = new ModelAndView("login");//login.jsp
			model.addObject("result", "Invalid Username or Password!!");
		}
		return model;
	}
	
	
	
	

	
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public ModelAndView viewSearch(@ModelAttribute Product product) {
		return new ModelAndView("search");//search.jsp
	}
	@RequestMapping(value = "search", method = RequestMethod.POST)
public ModelAndView processSearch(@ModelAttribute Product product) 
{
	boolean emp = productService1.checkSearch(product.getId());
	ModelAndView model = null;
	if (emp) 
	{
		model = new ModelAndView("searchsuccess");//searchsuccess.jsp
		model.addObject("emp", product.getId());//access in jsp
		
	} else {
		model = new ModelAndView("search");//search.jsp
		model.addObject("result", "Invalid Id!!");
	}
	return model;
}
}

