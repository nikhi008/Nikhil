package assumptions.assumethat;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class AssumptionThatDemo 
{
	@Test
	public void AssumeThat0()
	{
		assumingThat("Dev".equals(System.getProperty("Env")),
				        () -> {
				        	     System.out.println("Assumption Passed");
				        	     assertEquals(3, 3);
				              }
				     );
		
		System.out.println("Executes In Every Env");
		assertEquals(3, 3);
	}
	

}
