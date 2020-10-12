package com.several.ways.copying.array;

 class CopyingAnArra {
	
	public static void main(String[] args) {
		
	
	int a[] = {10,23,45,58,12};
	
	int b[]= new int[a.length];// it will creat length same as a length
	
	for(int i=0; i<a.length; i++){
		
		b[i]=a[i];
	}

	   for (int i = 0; i < b.length; i++)
       {
           System.out.println(b[i]);
       }
}
}


 class CopyingAnArray{
    public static void main(String[] args)
    {
        int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
 
        //creating a copy of array 'a' using clone() method
 
        int[] b = a.clone();  
 
        //Printing elements of array 'b'
 
        for (int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
    }
}