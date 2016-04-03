package Variables;
class A{
	int i = 10;
}
public class FinalVariable {

	public static void main(String[] args) {
		//final int i =10;
		//i = 20; //this is throw error
		final A a = new A();
		a.i = 20;
		System.out.println("Variable value: "+a.i);

	}

}
