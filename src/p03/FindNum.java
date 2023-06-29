package p03;

import java.util.Random;
import java.util.Scanner;

public class FindNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean correct = false; // 일단 false로 초기화
		Random random = new Random();
		int rNum = random.nextInt(10) + 1; // 1-10

		int i = 0;
		while (!correct) {
			System.out.print("1부터 10까지 숫자 입력하세요 : ");
			int inputNum = Integer.parseInt(scan.nextLine());
			if (rNum == inputNum) {
				System.out.println("맞다");
				correct = true;
			} else {
				System.out.println("아니다");
			}

		}
	}
}
