package dfsf;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
//		널리 잘 알려진 자료구조 중 최대 힙이 있다. 최대 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.
//		배열에 자연수 x를 넣는다.
//		배열에서 가장 큰 값을 출력하고, 그 값을 배열에서 제거한다.
//		프로그램은 처음에 비어있는 배열에서 시작하게 된다.
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		PriorityQueue <Integer> Maxheap = new PriorityQueue<>(Comparator.reverseOrder());
		
		for(int i =0; i<N;i++) {
			int inputData = scanner.nextInt();
			
			if(inputData == 0) {
				if(Maxheap.peek() == null) {
					System.out.println(0);
				}else {
					System.out.println(Maxheap.peek());
					Maxheap.remove();
				}
			}else {
				Maxheap.offer(inputData);
			}
		}
		
	}
}
