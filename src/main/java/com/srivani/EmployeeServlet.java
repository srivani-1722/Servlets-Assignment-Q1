package com.srivani;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeServlet extends HttpServlet {
	public static ArrayList<Employee> list;
	static {
		list=new ArrayList<Employee>();
		list.add(new Employee(1,"emp1",10000,43949252,"email1@gmail.com"));
		list.add(new Employee(2,"emp2",40000,11949252,"email2@yahho.com"));
		list.add(new Employee(3,"emp3",10500,98949252,"email1@gmail.com"));
		list.add(new Employee(4,"emp4",14200,783949252,"email1@facebook.com"));
		list.add(new Employee(5,"emp5",70000,439553252,"email1@gmail.com"));

	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><head><title>manis list</title></head><body><center><h1>List of Employess</h1>");
		out.println("<table><tr><td>employee ID</td><td>employee NAME</td><td>Employee sal</td><td>Employee phone no</td><td>Employee email</td>");
		for(int i=0;i<list.size();i++) {
			out.println("<tr><td>"+list.get(i).empId+"</td><td>"+list.get(i).name+"</td><td>"+list.get(i).salary+"</td><td>"+list.get(i).contact_no+"</td><td>"+list.get(i).email_id+"</td></tr>");
			
		}
		out.println("</center></body></html>");
		
	}

}
