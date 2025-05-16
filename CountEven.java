public class CountEven
{
	public int evenNumbers()
	{
		int count=0;
		for(int i=1;i<=50;i++){
			if(i%2==0){
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String args[]){
		CountEven obj=new CountEven();
		int result=obj.evenNumbers();
		System.out.println(result);
	}
}
			




