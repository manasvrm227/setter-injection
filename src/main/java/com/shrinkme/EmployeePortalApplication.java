package com.shrinkme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shrinkme.bean.EmployeeBean;

public class EmployeePortalApplication {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeBean employeeBean = (EmployeeBean) context.getBean("employee");
		
		System.out.println(employeeBean.toString());
		((ClassPathXmlApplicationContext) context).close();
	}
}
