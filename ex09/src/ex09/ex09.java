package ex09;

import java.util.Scanner;

public class ex09{

	static Scanner sc = new Scanner(System.in);
	static int n1,n2;
	static char op;
	static boolean fim = false;


	public static char menu(){
		System.out.printf(" + Somar    \n");
		System.out.printf(" - Subtrair \n");
		System.out.printf(" * Multiplicar \n");
		System.out.printf(" / Dividir \n");
		System.out.printf(" 0 Sair  \n");
		op = sc.next().charAt(0);
		return op;
	}


	public static void main(String[]args){
		do{
			System.out.printf("Insira primeiro valor> \n");
			n1 = sc.nextInt();
			System.out.printf("Insira segundo> \n");
			n2 = sc.nextInt();

			switch(menu()){
				case '+':					
					System.out.printf("Resultado : %d\n",n1+n2);
					break;
				case '-':
					System.out.printf("Resultado : %d\n",n1-n2);
					break;
				case '*':
					System.out.printf("Resultado : %d\n",n1*n2);
					break;
				case '/':
					System.out.printf("Resultado : %d\n",n1+n2);
					break;
				case '0':
					fim = true;
					break;
			}

		}while(!fim);
	}
}
		
		