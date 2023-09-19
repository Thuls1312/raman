package day5;

public class Condition10 {
	public static void main(String[]args) {
		int num=Integer.parseInt(args[0]);
		if(num<=100&&num>90) {
			System.out.println("o grade");
		}
		else if(num<=90&&num>80) {
			System.out.println("A grade");
		}
		else if(num<=80&&num>70) {
			System.out.println("A+ grade");
		}
		else if(num<=70&&num>60) {
			System.out.println("B grade");
		}
		else if(num<=60&&num>50) {
			System.out.println("B+ grade");
		}
		else if(num<=50&&num>35) {
			System.out.println("c grade");
		}
		else {
			System.out.println("other wise fail");
		}
		}
		
		
		
		
		
	}


