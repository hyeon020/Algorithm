package String;

import java.util.Scanner;

class String6 {
	public String solution(String str) {
		String answer="";
		for(int i=0; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);//str.indexOf(str.charAt(i))이게 뒤에나온 인덱스번호, i이게 앞에 중복된 인덱스 번호
		}
		return answer;
	}
	public static void main(String[] args) {
		String6 T = new String6();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(T.solution(str));
	}
}
