package com.chainsys.skilltest;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String line1=sc.nextLine();
    	String line2=sc.nextLine();
    	int number=line1.lastIndexOf(line2);
    	if(number!=-1)
    	{
    		int num=number/2+1;
    		System.out.println(num);
    	}
    	else
    	{
    		System.out.println(0);
    	}
    }
}
