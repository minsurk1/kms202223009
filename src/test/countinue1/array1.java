package test.countinue1;
import java.util.Scanner;
public class array1 {

	public static void main(String[] args) {
		String[] subjects = {"국어","영어","수학","화학","생명"};
		int[] scores=new int[5];
		int sum=0;
		double avg=0;
		Scanner s = new Scanner(System.in);
		//과목별로 성적을 입력 받아서 scores에 저장 
		for(int i =0;i<scores.length;i++) {
			System.out.print(subjects[i]+":");	
			scores[i]=s.nextInt();
		}
		avg = sum / (double)subjects.length;
		System.out.printf("당신의 점수=%d 평균=%d",scores,avg);
		s.close();
	}

}
