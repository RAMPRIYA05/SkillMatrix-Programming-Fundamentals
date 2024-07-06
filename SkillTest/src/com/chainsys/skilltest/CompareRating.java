package com.chainsys.skilltest;

import java.util.Scanner;

public class CompareRating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alice = new int[3];
		for (int i = 0; i < 3; i++) {
			alice[i] = sc.nextInt();
		}
		int[] bob = new int[3];
		for (int i = 0; i < 3; i++) {
			bob[i] = sc.nextInt();
		}
		int a = 0;
		int b = 0;
		for (int i = 0; i < 3; i++) {
			if (alice[i] > bob[i]) {
				a = a + 1;
			} else if (alice[i] < bob[i]) {
				b = b + 1;
			}
		}
		System.out.println(a+" "+b);
		

	}
}