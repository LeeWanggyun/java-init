package p05;

public class HumanExec {
	public static void main(String[] args) {
		Human[] humans = new Human[5];
		
		humans[0] = new Human();
		humans[0].name = "Lee";
		humans[0].money = 10000;
		
		humans[1] = new Human();
		humans[1].name = "Choi";
		humans[1].money = 20000;
		
		humans[2] = new Human();
		humans[2].name = "Kim";
		humans[2].money = 30000;
		
		humans[3] = new Human();
		humans[3].name = "Park";
		humans[3].money = 40000;
		
		humans[4] = new Human();
		humans[4].name = "Jo";
		humans[4].money = 50000;
		
		int sum = 0;
		for(int i=0; i<humans.length; i++) {
			sum += humans[i].money;		
		}
		System.out.println("총액 : " + sum);
		int avg = sum/humans.length;
		System.out.println("평균 : " + avg);
		String names = "";
		for(int i=0; i<humans.length; i++) {
			if(avg<=humans[i].money) {
				names += humans[i].name + "님, ";
			}
		}
		names = names.substring(0, names.length()-2);
		System.out.println(names + "은 평균 이상입니다.");
	}
}
