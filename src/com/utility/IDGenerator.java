package com.utility;

public class IDGenerator {

	public static int counter=0;
	
	public static int IDGen()
	{
		counter++;
		return counter;
	}
}
