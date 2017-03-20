package ex5;

import java.util.Scanner;

public class ex05{

	static int num;
	static int soma;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		do{
			System.out.printf("Insira um numero");
			num = sc.nextInt();
			soma += num;
		}while(num!=0);
			System.out.printf("%d ",soma);
	}
}