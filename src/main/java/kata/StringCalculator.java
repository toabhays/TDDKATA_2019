package kata;

public class StringCalculator {

	public int add(String numbers)
	{
		/*
		 * The method can take up to two numbers, separated by commas, and will return their sum.
		 * for example "" or "1" or "1,2" as inputs.
		 * (for an empty string it will return 0)
		 */

		if(numbers != null && numbers.trim().length() > 0)
		{
			String[] num = numbers.split(",");

			if(num.length == 1)
			{
				return Integer.parseInt(numbers);
			} else {
				return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
			}
		}

		return 0;
	}
}
