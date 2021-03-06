package com.engeto;

public class Calculator {
	public double calculate(int operand1, int operand2, Operation operation) {
		double result = 0.0;
		switch (operation) {
		case ADDITION:
			result = operand1 + operand2;
			break;
		case SUBTRACTION:
			result  = operand1 - operand2;
			break;
		case MULTIPLICATION:
			result = operand1 *  operand2;
			break;
		case DIVISION:
			result = operand1 / operand2;
			break;
		}
		
		return result;
		
	}
}
