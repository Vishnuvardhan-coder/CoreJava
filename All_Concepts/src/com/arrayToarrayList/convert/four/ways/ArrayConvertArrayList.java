package com.arrayToarrayList.convert.four.ways;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// There are 4 wasy we can convert Array to ArrayList

public class ArrayConvertArrayList {

	//1.Using Arrays.asList() MethodA
	
	public static void main(String[] args) {
		
		String [] array = new String []{"Android", "jsp" , "java", "Structs"};
		
		ArrayList<String> alist =  new ArrayList<String>(Arrays.asList(array));
	
		System.out.println(alist);
		
	}
}

//using Collection.addAll() method
class ArrayConvertArrayList2{
	
	public static void main(String[] args) {
		
		String [] array = new String []{"Android", "jsp" , "java", "Structs"};
		
		ArrayList<String> alist =  new ArrayList<String>();
		
		Collections.addAll(alist, array);
		
		System.out.println(alist);
		
	}
}

// using list addAll() method
 class ArrayToArrayListExample 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        ArrayList<String> list = new ArrayList<String>();
         
        list.addAll(Arrays.asList(array));
         
        System.out.println(list);
    }   
}
 
 
 
 // using java 8 stream
 
 class ArrayToArrayListExample3 
{   
    public static void main(String[] args) 
    {   
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
      List<String> list = Arrays.stream(array).collect(Collectors.toList());	
         
        System.out.println(list);
    }   
}
 
 
 
 
