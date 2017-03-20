package ex4;
	public class ex04{
		
		static int [] nums = {3,5,6,1};
		static int soma=0;
		
		public static void main(String[] args){
			for(int i=0;i<nums.length;i++){
				soma+=nums[i];
			}
			System.out.printf("%d\n",soma);
		}//end main function
	}//end public class