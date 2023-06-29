package p03;

import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	public static void main(String[] args) {
		
		System.out.print("1-45까지의 숫자를 ,를 기준으로 6개 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		String lottoStr = scanner.nextLine();
		String[] strs = lottoStr.split(",");
		
		Random random = new Random();
		int[] lotto = new int[6];
		for( int i = 0; i < lotto.length; i++) {
			int randNum = random.nextInt(8)+1;
			lotto[i] = randNum;
		}
		
		int c = 0;
		
		for (int i = 0; i < strs.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(strs[i].equals(lotto[j]+"")) {
					c++;
				}
			}
		}
		System.out.println(c + "개 맞춤!");
	}
} //쪽지 시험 여기서 3문제
