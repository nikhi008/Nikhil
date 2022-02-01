package test.paratest.csvsource;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.nikhil.paratest.csvsource.CsvSourceDemo;

public class testCsvSourceDemo 
{
	@ParameterizedTest
	@CsvSource({"car, rac"})
	public void csvsource0(String input, String expect)
	{
		CsvSourceDemo demo = new CsvSourceDemo();
		assertEquals(expect, demo.reverseString(input));
	}

	@ParameterizedTest
	@CsvSource({
		        "car, rac",
		        "test, tset"
	          })
	public void csvsource1(String input, String expect)
	{
		CsvSourceDemo demo = new CsvSourceDemo();
		assertEquals(expect, demo.reverseString(input));
	}
}
