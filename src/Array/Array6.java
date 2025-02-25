package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array6 {
	public boolean isPrime(int num) { //소수인지 확인하는 함수
		if(num<2) return false; //0과 1은 소수가 아님
		for(int i=2; i <num; i++) {
			if(num%i==0) return false; //약수가 존재하면 소수가 아님
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int tmp=arr[i];
			int res=0;
			while(tmp>0) {
				int t= tmp%10;
				res=res*10+ t;
				tmp=tmp/10;
			}
			if(isPrime(res)) answer.add(res);
		}
		return answer;
	}
	
	public  static void main(String[] args) {
		Array6 T = new Array6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //n의 개수
		int[] arr = new int[n]; //길이 배열
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n,arr)) {
			System.out.print(x+" ");
		}
	}
}
