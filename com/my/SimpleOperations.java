package com.my;

public class SimpleOperations {

	public int countLength(String str)
	{
		int count = 0;
		
		if(str!=null)
		count = str.length();
		
		return count;
	}
	
	public int sumOf(int x, int y) {
		return x+y;
	}
}
