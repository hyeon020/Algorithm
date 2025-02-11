package String;

import java.util.Scanner;

public class String12 {
	public String solution(int n, String str) {
		String answer="";
		for(int i=0; i<n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0'); //0부터 7인덱스 전까지, replace로 #을1, *을0으로
			int num = Integer.parseInt(tmp, 2); //2진수를 10진수로 정수화
			answer+=(char)num; //문자로
			str = str.substring(7);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String12 T = new String12();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.print(T.solution(n, str));
	}
}
