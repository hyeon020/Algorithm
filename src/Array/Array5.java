package Array;

import java.util.Scanner;

public class Array5 {
	public int solution(int n) {
		int answer=0;
		int[] ch = new int[n+1];
		for(int i=2; i<n; i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j=j+i) //j가 i의 배수만큼 증가
					ch[j]=1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Array5 T = new Array5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(T.solution(n));
	}
}
