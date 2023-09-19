package day5;

public class Condition13 {
	public static void main(String[]args) {
		int num=Integer.parseInt(args[0]);
		if(num<=6&&num>12) {
			System.out.println("good morning");
		}
		else if(num<=12&&num>18) {
			System.out.println("good afternoon");
		}
		else if(num<=18&&num>20) {
			System.out.println("good evening");
		}
		else {
			System.out.println("good night");
		}
		
		

}
}
