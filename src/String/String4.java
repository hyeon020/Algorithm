package String;

import java.util.ArrayList;
import java.util.Scanner;

class String4 {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		//뒤집는 코드 : reverse
		/*for(String x : str) { //x는 하나의 단어
			String tmp = new StringBuilder(x).reverse().toString(); //StringBuilder라는 객체 만들고 뒤집은 뒤 다시 문자열로
			answer.add(tmp);
		}*/
		//char[]사용
		for(String x : str) {
			char[] c = x.toCharArray();
			int lt = 0, rt = x.length()-1;
			while(lt<rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(c);
			answer.add(tmp);
		}
		return answer;
	}
	public static void main(String[] args) {
		String4 T = new String4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n]; //n개 배열 생성
		for(int i=0; i<n; i++) {
			str[i] = sc.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}
