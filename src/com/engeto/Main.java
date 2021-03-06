package com.engeto;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.calculate(8, 4, Operation.ADDITION));
		System.out.println(calculator.calculate(8, 4, Operation.SUBTRACTION));
		System.out.println(calculator.calculate(8, 4, Operation.MULTIPLICATION));
		System.out.println(calculator.calculate(8, 4, Operation.DIVISION));

	}

}
