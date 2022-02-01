package assumptions.assumefalse;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.Test;

public class AssumptionFalseDemo 
{
	@Test
	public void AssumeFalse0()
	{
		assumeFalse("Dev".equals(System.getProperty("Env")));
		System.out.println("Assumption Passed!");
		assertEquals(3, 3);
	}
	
	@Test
	public void AssumeFalse1()
	{
		assumeFalse("Dev".equals(System.getProperty("Env")), "Assumption Failed yar");
		System.out.println("Assumption Passed!");
		assertEquals(3, 3);
	}
	
	@Test
	public void AssumeFalse2()
	{
		assumeFalse("Dev".equals(System.getProperty("Env")), () -> "Assumption Failed Lamda");
		System.out.println("Assumption Passed!");
		assertEquals(3, 3);
	}

}
