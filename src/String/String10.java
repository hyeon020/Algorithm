package String;

import java.util.Scanner;

public class String10 {
	public int[] solution(String str, char t) {
		int[] answer=new int[str.length()];
		int p = 1000;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)==t) {
				p=0; 
				answer[i]=p;
			}
			else {
				p++;
				answer[i]=p;
			}
		}
		p=1000;
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==t) p=0;
			else {
				p++;
				answer[i]=Math.min(answer[i], p); // 이전꺼와 비교했을때 더 작은 것 넣음
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String10 T = new String10();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0); //문자 한개 읽음
		for(int x : T.solution(str, c)) {
			System.out.print(x+" ");
		}
	}
}
