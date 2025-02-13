package Baekjoon;

import java.util.Scanner;

public class String_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int[] arr = new int[26]; //알파벳 배열
		for(int i=0; i<26; i++) {
			arr[i]=-1; //초기값을 -1로 설정
		}

		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i); //문자열의 각 문자를 가져옴
			int num = ch - 'a';
			
			if(arr[num]==-1) { //문자가 아직 등장하지 않았을때(초기값 -1일때)
				arr[num]=i; //그 위치에 현재 문자의 인덱스 저장
			}
		}
		
		for(int i=0; i<26;i++) {
			System.out.print(arr[i]+" "); //결과 출력
		}
	}
}
