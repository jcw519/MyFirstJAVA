﻿package ifexample;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int score = scanner.nextInt();
		char grade;
		if(score < 60) {
			grade = 'F';
		} else if( score <70) {
			grade = 'D';
		} else if( score < 80) {
			grade = 'C';
		} else if( score < 90 ) {
			grade = 'B';
		} else {
			grade = 'A';
		}
		
		
		System.out.println(grade);
	}

}
