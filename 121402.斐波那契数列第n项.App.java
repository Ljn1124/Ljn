package pac;

import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner low=new Scanner(System.in);
		while(true) {
			int n=low.nextInt();
			int sum = 0;
	         int n1 = 0;
	         int n2 = 1;
			if(n>=1 && n<=40) {
				for(int i=2; i<=n; i++) {
					sum = n1+n2;
					n1 = n2;
					n2 = sum;
				}
				System.out.println(sum);
			}
		}			
	}
}
