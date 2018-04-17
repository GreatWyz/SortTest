package com.sort;

/*
 * @author 吴宜展
 * @2018/4/17
 * 测试Sort类中定义的排序方法
 */

public class SortTest {

  public static void main(String[] args) {
	  
	  //插入排序
	  
	  int[] a = {7,4,3,9,6,22,56,13};
	  System.out.println("排序之前为：");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(a[i] + " ");
	  }
	  System.out.println();
	  Sort.one(a);//直接插入排序
	  System.out.println("直接插入排序之后为： ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(a[i] + " ");
	  }
	  System.out.println();
	  
	  int[] b = {7,4,3,9,6,22,56,13};
	  System.out.println("排序之前为： ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(b[i] +" ");
	  }
	  System.out.println();
	  Sort.two(b);//二分插入排序
	  System.out.println("二分插入排序之后为： ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(b[i] + " ");
	  }
	  System.out.println();
	  
	  //选择排序
	  
	  int[] c = {7,4,3,9,6,22,56,13};
	  System.out.println("排序之前为： ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(c[i] +" ");
	  }
	  System.out.println();
	  Sort.three(c);//简单选择排序
	  System.out.println("简单选择排序之后为： ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(c[i] + " ");
	  }
	  System.out.println();
	  
	  //交换排序
	  
	  int[] d = {7,4,3,9,6,22,56,13};
	  System.out.println("排序之前为： ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(d[i] +" ");
	  }
	  System.out.println();
	  Sort.four(d);//冒泡排序
	  System.out.println("冒泡排序之后为： ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(d[i] + " ");
	  }
	  System.out.println();
	  
	  int[] e = {7,4,3,9,6,22,56,13};
	  System.out.println("排序之前为： ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(e[i] +" ");
	  }
	  System.out.println();
	  Sort.five(e);//快速排序
	  System.out.println("快速排序之后为： ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(e[i] + " ");
	  }
	  System.out.println();
	  
  }
}
