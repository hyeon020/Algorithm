package String;

import java.util.Scanner;

class String8 {
	public String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); //모두 대문자 만들고 알파벳이 아니라면 다 지우기""
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		return answer;
	}
	public static void main(String[] args) {
		String8 T = new String8();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); //띄어쓰기도 있으니 한줄 읽기
		System.out.print(T.solution(str));
	}
}
