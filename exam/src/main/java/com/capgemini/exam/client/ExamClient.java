package com.capgemini.exam.client;

import com.capgemini.exam.dao.ExamDao;
import com.capgemini.exam.dao.ExamDaoImpl;
import com.capgemini.exam.service.ExamService;
import com.capgemini.exam.service.ExamServiceImpl;

public class ExamClient {
	
	public static void main(String[] args) {
		ExamDao obj1=new ExamDaoImpl();
		ExamService obj2=new ExamServiceImpl();
		
		System.out.println("Enter the Exam Id:");
		Integer id=CgUtil.scan.nextInt();
		System.out.println("Enter the question id:");
		Integer qid=CgUtil.scan.nextInt();	
		System.out.println("Enter the question:");
		String ques=CgUtil.scan.next();
		System.out.println("Enter the options:");
		String []opt = null  ;
		for(int i=0;i<4;i++)
			opt[i]=CgUtil.scan.next();
		System.out.println("Enter the Answer:");
		String ans=CgUtil.scan.nextLine();
		System.out.println("Enter the Max. Marks:");
		Integer marks=CgUtil.scan.nextInt();
		
	
	}
}
