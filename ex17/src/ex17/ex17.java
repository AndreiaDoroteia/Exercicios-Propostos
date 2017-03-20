package ex17;

import java.util.Scanner;

public class ex17{
		
		static Scanner sc = new Scanner(System.in);
		static int n1,n2,med;

		public static void main(String [] args)
		{

		System.out.printf("Insira dois valores Inteiros diferentes \n");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		med = (n1+n2)/2;
		if(n1>n2)
			System.out.printf("%d e maior que %d e a media e de %d\n",n1,n2,med);
		else
			System.out.printf("%d e maior que %d e a media e de %d\n",n2,n1,med);
		}
}