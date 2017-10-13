package com.sun.module.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.beanio.stream.RecordReader;

import com.sun.module.dto.EmpDto;
import com.sun.module.model.dao.EmployeeDao;
import com.sun.module.model.service.EmployeeTester;

@SuppressWarnings("serial")
public class EnployeeServlet extends HttpServlet{
	private final static String FILE_PATH=RecordReader.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	private EmpDto dto=new EmpDto();
	private EmployeeTester service=null;
	private EmployeeDao dao=null;
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		service=new EmployeeTester();
		service.fetchData(FILE_PATH);
		dto.setEmp_name(req.getParameter("emp_name"));
		int id=dao.saveDto(dto);
		System.out.println(id);
	}
}
