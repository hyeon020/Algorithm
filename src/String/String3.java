package String;

import java.util.Scanner;

class String3 {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len>m) {
				m = len;
				answer = x;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String3 T = new String3();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //한 줄을 입력받기 위해
		System.out.print(T.solution(str));
	}
}
