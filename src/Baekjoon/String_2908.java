package Baekjoon;

import java.util.Scanner;

public class String_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		int reversea = Integer.parseInt(new StringBuilder(a).reverse().toString());
		int reverseb = Integer.parseInt(new StringBuilder(b).reverse().toString());
		
		System.out.print(reversea > reverseb ? reversea : reverseb);
	}
}
