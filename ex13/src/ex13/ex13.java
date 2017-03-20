package ex13;

public class ex13{
	static int golos [] = {0,2,2,4};
	static int med;

	static public void main(String[] args)	{
		for(int i=0;i<golos.length;i++){
			med+=golos[i];
		}
		System.out.printf("Media de golos nos ultimos 4 jogos: %d.\n",med/4);
	}
}