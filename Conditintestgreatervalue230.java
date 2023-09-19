package day5;

public class Conditintestgreatervalue230 {
	public static void main(String[]args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a>b&&a>c) {
			System.out.println("90");
		}
		else if(b>a&&b>c) {
			System.out.println("60");
		}
		else {
			System.out.println("57");
		}
	}

}
