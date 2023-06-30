package p05;

public class FoodExec {
	public static void printFood(Food[] foods) {
		for(Food f : foods) {
			System.out.println("음식 : " + f.name);
			System.out.println("가격 : " + f.price);
			System.out.println("타입 : " + f.type);
		}
	}
	public static void main(String[] args) {
		Food f = new Food();
		Food f1 = new Food();
		Food f2 = new Food();
		Food f3 = new Food();
		Food f4 = new Food();
		
		f.name = "삼겹살";
		f.price = 15000;
		f.type = "한식";
		
		f1.name = "갈비";
		f1.price = 16000;
		f1.type = "한식";
		
		f2.name = "김밥";
		f2.price = 3000;
		f2.type = "한식";
		
		f3.name = "떡";
		f3.price = 5000;
		f3.type = "한식";
		
		f4.name = "김치";
		f4.price = 7000;
		f4.type = "한식";
		
//		printFood(f);
//		printFood(f1);
//		printFood(f2);
//		printFood(f3);
//		printFood(f4);
		
		Food[] foods = new Food[5];
		foods[0] =f;
		foods[1] =f1;
		foods[2] =f2;
		foods[3] =f3;
		foods[4] =f4;
		
		printFood(foods);
		
	}
}
