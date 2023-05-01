package dfsf;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Q6_1927 {
	public static void main(String[] args) {
//		널리 잘 알려진 자료구조 중 최소 힙이 있다. 최소 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.
//		배열에 자연수 x를 넣는다.
//		배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
//		프로그램은 처음에 비어있는 배열에서 시작하게 된다.
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>(N);
		for(int i =0; i<N;i++) {
			int inputData = scanner.nextInt();
			if(inputData == 0) {
				if(minHeap.peek() == null) {
					System.out.println(0);
				}else {
					System.out.println(minHeap.peek()); //큐의 맨앞에 있는 값 반환
					minHeap.poll(); // 큐 맨앞에 있는 값 반환 후 삭제
				}
			}else {
				minHeap.add(inputData); //해당 큐 맨뒤에 값 삽입
			}
		}
	}
}
