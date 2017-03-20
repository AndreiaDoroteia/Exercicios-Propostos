package ex2;
import java.util.Scanner;

public class ex02{

	static char chars[] = new char[5];
	static int ctnum=0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){
		System.out.printf("Insira 5 caracteres");

		for(int i=0;i<5;i++){
		chars[i] = sc.next().charAt(0);
			if(chars[i]>='0' && chars[i]<='9')
			ctnum++;
		}

		System.out.printf("Foram introduzidos %d numeros",ctnum);


	}//end main function
}//end public class