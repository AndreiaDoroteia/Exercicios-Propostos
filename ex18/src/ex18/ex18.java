package ex18;

import java.util.Scanner;

public class ex18{
		
		static Scanner sc = new Scanner(System.in);
		static int n,ct=0;

	
		public static void main(String [] args){

			System.out.printf("Insira um valor ");
			n = sc.nextInt();

			for(int i=1;i<=n;i++){
				if(n%i==0)
				ct++;
			}

			if(ct==2)
				System.out.printf("Numero e primo\n");
			else
				System.out.printf("Numero nao e primo\n");
		}
}