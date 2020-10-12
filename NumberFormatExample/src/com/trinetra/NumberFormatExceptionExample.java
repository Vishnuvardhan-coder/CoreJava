package com.trinetra;

/*public class NumberFormatExceptionExample {

	public static void main(String[] args) {

		 System.out.println("This statement will be executed"); 
		 
	        Integer I = new Integer("abc");  //This statement throws NumberFormatException
	 
	        System.out.println("This statement will not be executed");
	    }
	}*/

public class NumberFormatExceptionExample
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        try
        {
            Integer I = new Integer("abc");  //This statement throws NumberFormatException
        }
        catch (Exception e)
        {
            System.out.println("exception caught");
        }
 
        System.out.println("Now, This statement will also be executed");
    }
}



//public class ExceptionHandling
//{
//    public static void main(String[] args)
//    {
//        System.out.println("This statement will be executed"); 
// 
//        int i = 1000/0;    //This statement throws ArithmaticException : / by zero
// 
//        System.out.println("This statement will not be executed");
//    }
//}




/*
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        String s = args[1];    //This statement throws ArrayIndexOutOfBoundsException
 
        System.out.println("This statement will not be executed");
    }
}*/