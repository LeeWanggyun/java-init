package p04;

import java.util.Scanner;

public class GuGuDan {

	public static void printGuGuDan(int firstDan, int secondDan) {
		for (int i = 0; i <= firstDan; i++) {
			for (int j = 0; j <= secondDan; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}
	}

	public static void main(String[] args) {
		printGuGuDan(9,10);
	}
}
