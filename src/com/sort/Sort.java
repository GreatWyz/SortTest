package com.sort;

/*
 * @author 吴宜展
 * @2018/4/17
 * 这个类中定义了几个排序的静态方法
 */

public class Sort {

  //静态方法one是直接插入排序
  public static void one(int[] a) {
	  for(int i = 1;i < a.length;i++ ) {
		  int temp = a[i];
		  int j;
		  for(j = i - 1;j >= 0;j--) {
			  if(a[j] > temp) {
				  a[j+1] = a[j];
			  }else {
				  break;
			  }
		  }
		  a[j+1] = temp;
	  }
	}
   
   //静态方法two是二分插入排序
   public static void two(int[] a) {
	   for(int i = 0;i < a.length;i++) {
		   int temp = a[i];
		   int left = 0;
		   int right = i-1;
		   int mid = 0;
		   while(left <= right) {
			   mid = (left + right) / 2;
			   if(temp < a[mid]) {
				   right = mid - 1;
			   }else {
				   left = mid + 1;
			   }
		   }
		   for (int j = i-1;j >= left;j--) {
			   a[j+1] = a[j];
		   }
		   if(left != i) {
			   a[left] = temp;
		   }
	   }
   }
   
   //静态方法three是简单选择排序
   public static void three(int[] a) {
        for(int i = 0;i < a.length;i++) {
        	int min = a[i];
        	int n = i;
        	for(int j = i + 1;j < a.length;j++) {
        		if(a[j] < min) {
        			min = a[j];
        			n = j;
        		}
        	}
        	a[n] = a[i];
        	a[i] = min;
        }
   }
   
   //静态方法four是冒泡排序
   public static void four(int[] a) {
	   for(int i = 0;i < a.length;i++) {
		   for(int j = 0;j < a.length - i - 1;j++) {
			   if(a[j] > a[j+1]) {
				   int temp = a[j];
				   a[j] = a[j+1];
				   a[j+1] = temp;
			   }
		   }
	   }
   }
   
   //静态方法five是快速排序
   public static void five(int[] a) {
	   if(a.length > 0) {
		   QuickSort(a,0,a.length - 1); 
	   }
   }
   private static void QuickSort(int[] a,int low,int high) {
	   if(low < high) {
		   int middle = getMiddle(a,low,high);
		   QuickSort(a,0,middle-1);
		   QuickSort(a,middle+1,high);
	   }
   }
   private static int getMiddle(int[] a,int low,int high) {
	   int temp = a[low];
	   while(low < high) {
		   while(low < high && a[high] >= temp) {
			   high--;
		   }
		   a[low] = a[high];
	       while(low < high && a[low] <= temp) {
	    	   low++;
	       }
	       a[high] = a[low];
	   }
	   a[low] = temp;
	   return low;
   }
}
