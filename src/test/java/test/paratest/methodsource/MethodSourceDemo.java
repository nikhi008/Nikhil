package test.paratest.methodsource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.nikhil.paratest.csvsource.CsvSourceDemo;

public class MethodSourceDemo 
{
	@ParameterizedTest
	@MethodSource("stringProvider")
	public void Methodsource0(String value)
	{
		assertNotNull(value);
	}
	
	public static Stream<String> stringProvider()
	{
		return Stream.of("A","B");
	}
	
	@ParameterizedTest
	@MethodSource("argumentsProvider")
	public void Methodsource1(String value, String expect)
	{
		CsvSourceDemo demo = new CsvSourceDemo();
		assertEquals(expect, demo.reverseString(value));
	}
	
	public static Stream<Arguments> argumentsProvider()
	{
		return Stream.of(
				             Arguments.of("Car", "raC"),
				             Arguments.of("Car", "raC2")
				        );
	}

}
