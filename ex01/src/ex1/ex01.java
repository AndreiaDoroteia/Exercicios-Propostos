package ex1;

import java.util.Scanner;

public class ex01{

	static int num[] = new int [5];
	static int ct=0;
	static int maior=0,menor=0;
	static Scanner sc = new Scanner(System.in);
	static boolean fim = false;

	public static void main (String[] args){

		do{
			System.out.printf("Introduza 5 valores (1/100) \n");
			num[ct] = sc.nextInt();
		
			if(num[ct]>=1 && num[ct]<=100){
				if(num[ct]>maior)
				maior = num[ct];
				else if(num[ct]<menor || menor==0)
				menor = num[ct];
			ct++;
			System.out.printf("\n Introduza numero %d",ct);
			}else{
			System.out.printf(" Erro no numero");
			}
			if(ct>4)
			fim = true;

		}while(!fim);

			System.out.printf("Numero Maior : %3d \n",maior);
			System.out.printf("Numero Menor : %3d \n",menor);

	}//end main func
}//end public class