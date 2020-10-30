package chap03;

import java.util.Scanner;

//선형검색
public class SeqSearch {

	static int seqSearch(int[] x, int num, int key) {
		int i = 0;
		
		while (true) {
			if (i == num) { //num은 입력받은 요소개수, i는 계속증가하므로 최대증가값이 num이랑 같으면 검색실패
				return -1; //검색실패시 반환값
			} 
			
			if (x[i] == key) {
				return i; //겁색성공시 반환값
			}
			
			i++;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수:");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i=0; i < num; i++) {
			System.out.print("x[" + i + "]");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값:");
		int key = stdIn.nextInt();
		
		int idx = seqSearch(x, num, key);
		
		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(key + "은/는 x[" + idx + "]에 있습니다.");
		}
	}
}
