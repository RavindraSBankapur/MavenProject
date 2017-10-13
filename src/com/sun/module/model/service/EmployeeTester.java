package com.sun.module.model.service;
import java.io.BufferedReader;
import java.io.FileReader;

import org.beanio.stream.RecordReader;

import com.sun.module.dto.DeptDto;
import com.sun.module.dto.DesignationDto;
import com.sun.module.dto.EmpDto;

public class EmployeeTester {
	
	public static final String FILE_PATH=RecordReader.class.getProtectionDomain().getClass().get
/*	//trying to second commithi
			----
			---
			----
			----
			----
			----*/
	Map<Integer,List<String>> map=new HashMap();
	public static EmpDto fetchData(String data)
	{		
			FileReader fr=null;
			fr=new FileReader("resource");
			
			BufferedReader br=new BufferedReader(fr);
			String records;
			while(br.readLine()!=null)
			{
				record=br.readLine();
				System.out.println(mapRecordObject);
			}
		/*EmpDto dto=null;
			DeptDto ddto=null;
			DesignationDto dsdto=null; 
		try {
				FileReader fr = new FileReader(data);
				BufferedReader br = new BufferedReader(fr);
				String employeeData = br.readLine();
				int count = 0;
				int randomNumber =(int)( Math.floor(Math.random()*4)+1);
				System.out.print(randomNumber);
				
				while(count!=randomNumber && employeeData != null)
				{
					count++;
					employeeData = br.readLine();
				}
				employeeData = br.readLine();
				String[] ddt=employeeData.split(",");
				dto=new EmpDto();
				ddto=new DeptDto();
				dsdto=new DesignationDto();
				
				return dto;
			
			} 
		catch (Exception e) 
			{
				e.printStackTrace();
			}
		return null;*/
	}
	public static void main(String[] args) {
		
		EmpDto data = fetchData("WebContent/WEB-INF/lib/employeedata.txt");
		System.out.println(" "+data);
	}

}