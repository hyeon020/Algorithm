package String;

import java.util.Scanner;

class String7 {
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase();//모두 대문자로 바꿔버리고 확인
		/*int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
		}*/ //문자배열 len/2로 비교
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		return answer;
	}
	public static void main(String[] args) {
		String7 T = new String7();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}
}
