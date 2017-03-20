package ex16;

//bibliotecas
import java.util.Scanner;
//public class
public class ex16{
		static Scanner sc = new Scanner(System.in);
		static String message;

		public static String readMessage(){
			String men;
			System.out.printf("Insira uma mensagem> ");
			men = sc.nextLine();
			return men;
		}

		public static void showMessage(){
			String men = readMessage();
			System.out.printf("\n");
			for(int i=0;i<5;i++){
				System.out.printf("%s \n",men);
			}
		}
		//main function
		public static void main(String [] args){
			showMessage();

		}
}