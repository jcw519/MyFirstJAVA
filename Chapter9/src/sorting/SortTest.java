﻿package sorting;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B : bubble sort");
		System.out.println("H : heap sort");
		System.out.println("Q : quic sort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}
		else if (ch == 'h'||ch == 'H') {
			sort = new HeapSort();
		}
		else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("ERROR");
		}
		
		int[] arr = {1,2,3};
		
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();

	}

}
