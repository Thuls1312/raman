package day5;

public class Condition7 {
	public static void main(String[]args) {
		int num=Integer.parseInt(args[0]);
		if(num%2==0&&num%3==0) {
			System.out.println("is divisible");
		}
		else {
			System.out.println("is not divisible");
		}
	}

}
