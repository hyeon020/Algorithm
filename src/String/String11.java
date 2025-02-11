package String;

import java.util.Scanner;

public class String11 {
	public String solution(String str) {
		String answer="";
		str = str+" ";
		int cnt = 1;
		for(int i=0; i<str.length()-1; i++) { //i는 빈문자 전까지만
			if(str.charAt(i)==str.charAt(i+1)) cnt++;
			else {
				answer+=str.charAt(i);
				if(cnt>1) answer+=Integer.toString(cnt);
				cnt=1; //다시 cnt 1로 초기화
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String11 T = new String11();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}
}
