public class MultiplesOf9{
	public void getMultiples(){
		for(int i=1;i<100;i++){
			if(i%9==0)
				System.out.println(i);
		}
	}
	public static void main(String args[]){
		MultiplesOf9 obj=new MultiplesOf9();
		obj.getMultiples();
	}
}
			