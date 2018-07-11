package com.tcs.SampleApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tcs.SampleApp.bean.Employee;

@Controller
public class SampleAppController {
	 public static ArrayList<Employee> empList = new ArrayList<Employee>();

	@RequestMapping(value = "/" ,  method  = RequestMethod.GET  )
	public String index() {
		System.out.println("Inside Index");
		return "index.html";
	}

	@RequestMapping(value  = "/insertEmp" , method = RequestMethod.POST)
	@ResponseBody
	public List<Employee> insertEMP(@RequestBody Employee emp) {
		
		System.out.println(emp.getFirstName());
		empList.add(emp);
		return empList;
	}
	
	@RequestMapping(value  = "/getEmp" , method  = RequestMethod.GET )
	@ResponseBody
	public List<Employee> getEMP () {
		return empList;
	}	
}
