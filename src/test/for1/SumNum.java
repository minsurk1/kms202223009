package test.for1;

import java.util.Scanner;

public class SumNum {

	public static void main(String[] args) {
		int n;
		int sum;
		int nu;
		
		Scanner s = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		nu=s.nextInt();
		
		sum=0;
		for(n=1;n<=nu;n++)
			sum=sum+n;
		System.out.println("1부터" +nu+"까지의 합은"+sum+"입니다.");
	}

}
