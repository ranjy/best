package com.ran.test.aop.advice.service;

public interface BankService {
	
	//模拟银行转账
	public boolean transfer(String form, String to, double account);
	
	public void test();
	
	

}
