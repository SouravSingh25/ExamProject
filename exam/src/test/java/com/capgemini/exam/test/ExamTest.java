package com.capgemini.exam.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.exam.entity.Questions;
import com.capgemini.exam.exception.IDException;
import com.capgemini.exam.exception.ValidationException;
import com.capgemini.exam.service.ExamService;
import com.capgemini.exam.service.ExamServiceImpl;

public class ExamTest {
	
		ExamService ser=new ExamServiceImpl();
		String[] arr1= {"1.JavaVirtualMachine","2.JavaVerticalMahine","3.JavaVirtueMachine","4.None of these"};
		@Test
		public void testExam1(Questions question) throws IDException, ValidationException {
			assertTrue(ser.addQuestion(101, new Questions(16,"What is full form of jvm?",arr1,"JavaVirtualMachine",1)));
			
			}
		@Test
		public void testExam2(Questions question) throws IDException, ValidationException {
			assertFalse(ser.addQuestion(101, new Questions(14,"What is full form of jvm?",arr1,"JavaVirtualMachine",1)));
			
			}
		@Test
		public void testExam3(Questions question) {
			assertThrows(ValidationException.class,() ->{ser.addQuestion(105,new Questions());});
			
			}
		
}
		
		
		

