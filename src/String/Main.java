package String;

import java.util.Scanner;

class Main {
	public int solution(String str, char t) {
		int answer=0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		//System.out.println(str+ " "+t);
		/*for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==t) {
				answer++;
			}
		}*/
		
		for(char x : str.toCharArray()) {
			if(x==t) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); //next는 문자열 읽어들임
		char c = kb.next().charAt(0); //인덱스 0번 문자
		
		System.out.print(T.solution(str, c));
		
	}
}
