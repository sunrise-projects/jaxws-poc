package com.testing.poc.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.testing.poc.OperationBo;

@WebService
public class OperationWS{

	//DI via Spring
	OperationBo operationBo;

	@WebMethod(exclude=true)
	public void setOperationBo(OperationBo operationBo) {
		this.operationBo = operationBo;
	}

	@WebMethod(operationName="add")
	public int add(int firstNumber, int secondNumber) {
		
		return operationBo.add(firstNumber, secondNumber);
		
	}
 
}