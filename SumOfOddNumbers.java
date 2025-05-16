 public class SumOfOddNumbers{
	public int sumOfOddNumbers(){
		int sum=0;
		for(int i=1;i<30;i=i+2){
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String args[]){
		SumOfOddNumbers obj=new SumOfOddNumbers();
		int result=obj.sumOfOddNumbers();
		System.out.println(result);
	}
}
		