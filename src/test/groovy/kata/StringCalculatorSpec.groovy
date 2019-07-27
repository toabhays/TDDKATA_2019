package kata

import spock.lang.Specification

class StringCalculatorSpec extends Specification {
	def "Add given two numbers seperated by comma" () {
		given: "number"
		when: "add(String numbers) is called"
			def result = new StringCalculator().add("");
		then: "it should written sum of two numbers"
			result == 0;
	}

	def "Test case for different numbers" () {
		given: "number"
		when: "add(String numbers) is called"
			def result = new StringCalculator().add(numbers);
		then: "it should written sum of two numbers"
			result == excpectedResult;
		where : "Provided two numbers for numbers and excpectedResult"
				numbers		  	| excpectedResult
				null   			| 0
				""   			| 0
				"1"   			| 1
				"1,2"   		| 3
	}

}
