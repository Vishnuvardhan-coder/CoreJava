package com.arrayToarrayList.convert.four.ways;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<String>();
    
    list.add("JAVA");
     
    list.add("JSP");
     
    list.add("ANDROID");
     
    list.add("STRUTS");
     
    list.add("HADOOP");
     
    list.add("JSF");
     
    String[] array = new String[list.size()]; 
     
    list.toArray(array);
     
    for (String string : array)
    {
        System.out.println(string);
    }

}}


/*
List<user> userlist = new ArrayList<user>();


userlist.add(new user("kk" , 25, 9090206052));
userlist.add(new user("ravi", 28, 9875645812));


public List<user> getUserList(){
	return userlist;
}*/
