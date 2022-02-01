package assertions.lifecyclepermethod;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
public class LifeCycleDemo 
{
	
	public LifeCycleDemo()
	{
		System.out.println("Constructor Created");
	}
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("Before All Called");
	}
	
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("Before Each Called");
	}
	
	@Test
	@DisplayName("Display")
	public void test1()
	{
		System.out.println("Test1 called");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 called");
	}
	
	@AfterEach
	public void AfterEach()
	{
		System.out.println("After Each Called");
	}
	
	@AfterAll
	public static void AfterAll()
	{
		System.out.println("After All Called");
	}
	
}
