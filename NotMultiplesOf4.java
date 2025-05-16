public class NotMultiplesOf4{
	public void getMultiples(){
		for(int i=1;i<=100;i++){
			if(i%4!=0)
				System.out.println(i);
		}
	}
	public static void main(String args[]){
		NotMultiplesOf4 obj=new NotMultiplesOf4();
		obj.getMultiples();
	}
}
		