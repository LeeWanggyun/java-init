package p04;

public class MethodTest4 {
	
	public static int[] getLotto() { //메서드란 : 기능을 저장하기 위해서 사용함.
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			int rNum = MethodTest2.getRandomNum(45);
			for(int j=0; j<i; j++) {
				if(lotto[j] == rNum) {
					i--;
				}
			}
			if(lotto[i]==0) {
				lotto[i] = rNum;
			}
		}
		return lotto;
	}
	public static void printLotto(int[] lotto) {
		for(int i=0; i<lotto.length; i++) {
			System.out.println("lotto[" + i +"] : " + lotto[i]);
		}
	}
		
	public static void main(String[] args) {
		int[] lotto = getLotto();
		printLotto(lotto);
		}
	}
