package test.paratest.valuesource;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.nikhil.paratest.valuesource.ValueSourceDemo;

public class TestValueSourceDemo 
{
	@Test
	public void testEvenNumber0()
	{
		ValueSourceDemo demo = new ValueSourceDemo();
		assertTrue(demo.EvenNumber(2));
	}

	@ParameterizedTest
	@ValueSource(ints = {2, 3, 4, 6})
	public void testEvenNumber1(int number)
	{
		ValueSourceDemo demo = new ValueSourceDemo();
		assertTrue(demo.EvenNumber(number));
	}

}
