package String;

import java.util.Scanner;

class String2 {
	public String solution(String str) {
		String answer = "";
		for(char i : str.toCharArray()) { //문자 배열화
			if(Character.isLowerCase(i)) {
				answer += Character.toUpperCase(i);
			}
			else answer += Character.toLowerCase(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String2 T = new String2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(T.solution(str));
	}
}
