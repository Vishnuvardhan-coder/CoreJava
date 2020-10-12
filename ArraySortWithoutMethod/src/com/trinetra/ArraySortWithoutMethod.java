package com.trinetra;

public class ArraySortWithoutMethod {

	public static void main(String[] args) {

		int a[] = new int[] { 3, 2, 1 }; //2 3 1 - 2 1 3 -1 2 3
		                 //   0  1  2
		/*Arrays.sort(a);
		   for (int i = 0; i < a.length; i++) {
			   System.out.println(a[i]);*/
		
		
	
		for (int i = 0; i < a.length; i++) { //3
			for (int j = i + 1; j < a.length; j++) {//2
				if (a[i] > a[j]) {//3>2
					int temp = a[i];//temp=3
					a[i] = a[j];//a[i]=2
					a[j] = temp;//a[j]=3
				}
			}
		}

		for (int k = 0; k < a.length; k++) {
			System.out.println(" " + a[k]);

		

	}
}
}
/*
 * String s = "vishnuvardhan"; char a[] = s.toCharArray(); char b[] = new
 * char[a.length]; int count=0; for(int i=0;i<a.length;i++){ count = 0; for(int
 * j=0;j<a.length;j++){ if(a[i]<a[j]){ count++;
 * 
 * } }
 * 
 * b[count]=a[i];
 * 
 * } for(char x : b) { System.out.println(x); } }
 * 
 * }
 */
