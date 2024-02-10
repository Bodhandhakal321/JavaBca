package Progarms;

public class Sequence {

	public static void main(String[] args) {
		int n =9;
		while(n>1) {
			if(n % 2 == 0) {
				n = n/2;
				System.out.print(n+",");
			} else if(n%2 !=0) {
				n =(n * 3) + 1;
				System.out.print(n+",");
			}
		}

	}

}
