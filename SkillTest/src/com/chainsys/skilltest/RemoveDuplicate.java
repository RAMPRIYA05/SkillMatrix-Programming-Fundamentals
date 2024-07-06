package com.chainsys.skilltest;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int[] num = new int[number];
		for (int i = 0; i < number; i++) {
			num[i] = sc.nextInt();
		}
		int n = removeDuplicate(num);
		for (int i = 0; i < n; i++) {
			System.out.println(num[i]);
		}
		System.out.println(n);
	}

	public static int removeDuplicate(int[] num) {
		if (num.length == 0) {
			return 0;
		}
		int i = 0;
		for (int j = 1; j < num.length; j++) {
			if (num[j] != num[i]) {
				i++;
				num[i] = num[j];
			}
		}
		return i + 1;
	}
}
