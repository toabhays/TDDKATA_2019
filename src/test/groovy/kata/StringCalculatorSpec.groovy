package kata

import spock.lang.Specification

class StringCalculatorSpec extends Specification {
	def "Add given two numbers seperated by comma" () {
		given: "number"
		when: "add(String numbers) is called"
			def result = new StringCalculator().add(numbers);
		then: "it should written sum of two numbers"
			result == 0;
	}
}
