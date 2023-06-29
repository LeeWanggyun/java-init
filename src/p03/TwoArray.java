package p03;

public class TwoArray {

	public static void main(String[] args) {
		int[][] numsArray = new int[3][3];
		
		int cnt = 1;
		for (int i=0; i<numsArray.length; i++) {

			for (int j=0; j<numsArray[i].length; j++) {
				numsArray[i][j] = cnt++;
			}
		}
		for (int i=0; i<numsArray.length; i++) {
			for (int j=0; j<numsArray[i].length; j++) {
				System.out.println(numsArray[i][j]);
			}
		}
	}
}
