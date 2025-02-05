package String;

import java.util.Scanner;

class String3 {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len>m) { //만약 >=하면 뒤에서 똑같을경우 뒤에꺼로 갱신된다.
				m = len;
				answer = x;
			}
		} //split 사용한 것
		
		return answer;
	}
	public static void main(String[] args) {
		String3 T = new String3();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine(); //한 줄을 입력받기 위해
		System.out.print(T.solution(str));
	}
}
