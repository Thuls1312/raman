package day5;

public class Condition11 {
	public static void main(String[]args) {
		Float num=Float.parseFloat(args[0]);
		if(num<=10&&num>9.5) {
			System.out.println("excellent");
		}
		else if(num<=9.5&&num>7.5) {
			System.out.println("good");
		}
		else if(num<=7.5&&num>5.5) {
			System.out.println("average");
		}
		else if(num<=5.5&&num>3.5) {
			System.out.println("bad");
		}
		else {
			System.out.println("others wise are poor");
		}
		

}
}
