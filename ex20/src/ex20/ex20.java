package ex20;

import java.util.Scanner;

public class ex20{	
	
		static Scanner sc = new Scanner(System.in);
		static int idade,ano=2017,fut;


		public static void main(String [] args){

			System.out.printf("Insira idade> ");
			idade = sc.nextInt();

			ano-=idade;
			System.out.printf("Ano nasc %d ",ano);

			System.out.printf("Insira um ano futuro> ");
			fut = sc.nextInt();

			idade=-fut;
			System.out.printf("A sua idade sera %d anos ",idade);
		}
}