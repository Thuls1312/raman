package day5;

public class Condition9 {
	public static void main(String[]args) {
		int num=7;
		if(num%2==0&&num%3==0) {
			System.out.println("is notdivisible");
		}
		else if(num%2==0) {
			System.out.println("is divisible");
		}
		else if(num%3==0) {
			System.out.println("is not divisible");
		}
		else {
			System.out.println("neutral");
		}
			
	}

}
