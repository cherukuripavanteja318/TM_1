package Java;

import java.util.Scanner;

public class FibanaciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter a size");
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
		    System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		}

	}

}
