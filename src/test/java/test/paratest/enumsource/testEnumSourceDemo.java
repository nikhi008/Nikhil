package test.paratest.enumsource;



import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;

import com.nikhil.paratest.enumsource.EnumSourceDemo;

public class testEnumSourceDemo 
{
	@ParameterizedTest
	@EnumSource(value = EnumSourceDemo.class)
	public void enumSource0(EnumSourceDemo demo)
	{
		assertNotNull(demo);
	}
	
	@ParameterizedTest
	@EnumSource(value = EnumSourceDemo.class, names = {"JAN", "FEB"})
	public void enumSource1(EnumSourceDemo demo)
	{
		assertNotNull(demo);
	}
	
	@ParameterizedTest
	@EnumSource(value = EnumSourceDemo.class, mode = Mode.EXCLUDE, names = {"JAN", "FEB"})
	public void enumSource2(EnumSourceDemo demo)
	{
		assertNotNull(demo);
	}

}
