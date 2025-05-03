package Array;

import java.util.Scanner;

public class Array7 {
	public int solution(int n, int[] arr) {
		int answer=0, cnt=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==1) {
				cnt++;
				answer+=cnt;
			}
			else cnt=0;
		}
		return answer;
	}
	
	public  static void main(String[] args) {
		Array7 T = new Array7();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n의 개수
		int[] arr = new int[n]; //길이 배열
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(T.solution(n, arr));
	}
}
