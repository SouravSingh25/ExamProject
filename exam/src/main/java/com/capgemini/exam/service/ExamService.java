package com.capgemini.exam.service;

import com.capgemini.exam.entity.Questions;
import com.capgemini.exam.exception.IDException;
import com.capgemini.exam.exception.ValidationException;


public interface ExamService {
	
	/***************************************************************
	 * @author Sourav Singh
	 * 
	 * @description: provide the Method to for its implementation.
	 *  and getting support from the Dao Layer
	 * 
	 ***************************************************************/
	public boolean addQuestion(int testId,Questions question)throws IDException, ValidationException;
	

}
