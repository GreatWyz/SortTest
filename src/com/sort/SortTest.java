package com.sort;

/*
 * @author ����չ
 * @2018/4/17
 * ����Sort���ж�������򷽷�
 */

public class SortTest {

  public static void main(String[] args) {
	  
	  //��������
	  
	  int[] a = {7,4,3,9,6,22,56,13};
	  System.out.println("����֮ǰΪ��");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(a[i] + " ");
	  }
	  System.out.println();
	  Sort.one(a);//ֱ�Ӳ�������
	  System.out.println("ֱ�Ӳ�������֮��Ϊ�� ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(a[i] + " ");
	  }
	  System.out.println();
	  
	  int[] b = {7,4,3,9,6,22,56,13};
	  System.out.println("����֮ǰΪ�� ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(b[i] +" ");
	  }
	  System.out.println();
	  Sort.two(b);//���ֲ�������
	  System.out.println("���ֲ�������֮��Ϊ�� ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(b[i] + " ");
	  }
	  System.out.println();
	  
	  //ѡ������
	  
	  int[] c = {7,4,3,9,6,22,56,13};
	  System.out.println("����֮ǰΪ�� ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(c[i] +" ");
	  }
	  System.out.println();
	  Sort.three(c);//��ѡ������
	  System.out.println("��ѡ������֮��Ϊ�� ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(c[i] + " ");
	  }
	  System.out.println();
	  
	  //��������
	  
	  int[] d = {7,4,3,9,6,22,56,13};
	  System.out.println("����֮ǰΪ�� ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(d[i] +" ");
	  }
	  System.out.println();
	  Sort.four(d);//ð������
	  System.out.println("ð������֮��Ϊ�� ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(d[i] + " ");
	  }
	  System.out.println();
	  
	  int[] e = {7,4,3,9,6,22,56,13};
	  System.out.println("����֮ǰΪ�� ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(e[i] +" ");
	  }
	  System.out.println();
	  Sort.five(e);//��������
	  System.out.println("��������֮��Ϊ�� ");
	  for(int i = 0;i < 8;i++) {
		  System.out.print(e[i] + " ");
	  }
	  System.out.println();
	  
  }
}
