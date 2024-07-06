package com.chainsys.skilltest;

import java.util.Scanner;

public class ProductNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int[] arr = new int[number];
		for (int i = 0; i < number; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr1 = new int[number];
		for (int i = 0; i < number; i++) {
			int temp = 1;
			for (int j = 0; j < number; j++) {
				if (i != j) {
					temp = temp * arr[j];
				}
			}
			arr1[i] = temp;
			System.out.println(arr1[i]);
		}
		
	}
}
