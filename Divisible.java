public class Divisible{
	public void getMultiples()
	{
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0)
				System.out.println(i);
		}
	}
	public static void main(String args[]){
		Divisible obj=new Divisible();
		obj.getMultiples();
	}
}
	