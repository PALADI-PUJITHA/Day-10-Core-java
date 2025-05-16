public class ReverseMultiplication{
	public void multiplication(int num)
	{
		for(int i=10;i>=1;i--){
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}
	public static void main(String args[]){
		ReverseMultiplication obj=new ReverseMultiplication();
		obj.multiplication(6);
	}
}