package ex14;

public class ex14{

	static int num [] = {5,2,7};
	static int produto=1;

	static public void main(String[] args){
		for(int i=0;i<num.length;i++){
			produto*=num[i];
		}
		System.out.printf("Resultado: %d.\n",produto);
	}
}