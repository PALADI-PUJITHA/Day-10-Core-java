
public class CommonDivisibles{
	public void getDivisibles(){
		for(int i=1;i<=50;i++){
			if(i%4==0||i%6==0)
				System.out.println(i);
		}
	}
	public static void main(String args[]){
		CommonDivisibles obj=new CommonDivisibles();
		obj.getDivisibles();
	}
}