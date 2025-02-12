package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]); //인덱스0은 무조건 출력
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		Array1 T = new Array1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n 받기
		int[] arr = new int[n]; //n크기의 배열 만들기
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}
}
