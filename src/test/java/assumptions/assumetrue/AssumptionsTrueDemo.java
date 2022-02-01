package assumptions.assumetrue;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class AssumptionsTrueDemo 
{
	@Test
	public void AssumeTrue0()
	{
		assumeTrue("Dev".equals(System.getProperty("Env")));
		System.out.println("Assumption Passed!");
		assertEquals(3, 3);
	}
	
	@Test
	public void AssumeTrue1()
	{
		assumeTrue("Dev".equals(System.getProperty("Env")), "Assumption Failed yar");
		System.out.println("Assumption Passed!");
		assertEquals(3, 3);
	}
	
	@Test
	public void AssumeTrue2()
	{
		assumeTrue("Dev".equals(System.getProperty("Env")), () -> "Assumption Failed Lamda");
		System.out.println("Assumption Passed!");
		assertEquals(3, 3);
	}

}
