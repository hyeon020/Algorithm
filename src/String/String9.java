package String;

import java.util.Scanner;

public class String9 {
	public int solution(String str) {
		String answer = "";
		answer = str.replaceAll("[^0-9]", "");
		return Integer.parseInt(answer);
	}
	public static void main(String[] args) {
		String9 T = new String9();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}
}
