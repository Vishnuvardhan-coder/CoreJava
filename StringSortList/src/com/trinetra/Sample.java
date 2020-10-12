package com.trinetra;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {

//		String names;
		/*List<String> names = Arrays.asList("Apple","Anar","Balu","bucket");	
		Collections.sort(names);
		System.out.println(names);*/
	/*	
		List<String> alList = new ArrayList<String>();
		alList.add("Apple");
		alList.add("Anar");
		alList.add("Balu");
		alList.add("Bucket");*/
		

			int count=1;
			int arr[]={1,2,3,5,6,2,1};
			int x=arr.length-1;
			for(int i=1;i<x;i++)
			{
			for(int j=i+1;j<x;j++)
			{
			if(arr[i]==arr[j])
			{
			count=count+1;
			}
			}
			}
			System.out.println("there are: " +count+"\t duplicate words in the given array");
			}
			
			
		}
		
	

			