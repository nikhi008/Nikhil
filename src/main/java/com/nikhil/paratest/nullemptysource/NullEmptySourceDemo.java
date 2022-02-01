package com.nikhil.paratest.nullemptysource;

public class NullEmptySourceDemo 
{
	public String reverseString(String input)
	{
		if(input == null)
		{
			return null;
		}
		
		if("".equals(input))
		{
			return "";
		}
		
		char[] chars = input.toCharArray();
		int start = 0;
		int end = chars.length - 1;
		
		while(start < end)
		{
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;			
			start++;
			end--;
		}		
		return new String(chars);
	}

}
