package 김민수202223009;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("반복횟수 입력:");
		int num = s.nextInt();
		int i = 0;
		do {
			System.out.println("do~while문을 사용하여 반복합니다.");
			i++;
		}while(i<num);
		s.close();
	}

}
