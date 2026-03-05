package com.msedcl.main;

import com.msedcl.main.util.CalculatorUtil;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorUtil calculatorUtil = new CalculatorUtil();
		System.out.println("Addition ="+calculatorUtil.addition(10,20,30));
       System.out.println("subtraction="+calculatorUtil.subtraction(20,30));
       System.out.println("Product= " + calculatorUtil.multiplication(20,30));
	}

}
