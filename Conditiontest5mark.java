package day5;

public class Conditiontest5mark {
	public static void main(String[]args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		int d=Integer.parseInt(args[3]);
		int e=Integer.parseInt(args[4]);
		if(a>b&&a>c&&a>d&&a>e) {
			System.out.println("is highest score 10");
		}
			else if(b>a&&b>c&&b>d&&b>e) {
				System.out.println("is highest score 20");
			}
			else if(c>a&&c>b&&c>d&&c>e) {
				System.out.println("is highest score 30");
			}
			else if(d>a&&d>b&&d>c&&b>e) {
				System.out.println("is highest score 40");
			}
			else {
				System.out.println("is highest score 50");
			}
		}

}
		
		
		
		
	
