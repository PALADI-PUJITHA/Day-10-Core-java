public class Cubes{
	public void getCubes(){
		for(int i=1;i<=10;i++){
			System.out.println(i*i*i);
		}
	}
	public static void main(String args[]){
		Cubes obj=new Cubes();
		obj.getCubes();
	}
}