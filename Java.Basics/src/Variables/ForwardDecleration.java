package Variables;

public class ForwardDecleration {

	public static void main(String[] args) {
		FD fd = new FD();
		fd.fun(10);

	}

}
class FD{
	
	void fun(int i){
		System.out.println(i);
	}
}