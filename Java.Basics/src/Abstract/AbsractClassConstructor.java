package Abstract;
abstract class Base{
	Base(){
		System.out.println("Inside Base Constrcuor");
	}
}
class Derived extends Base{
	public Derived() {
		System.out.println("Inside Derived Constuctor");
	}
}
public class AbsractClassConstructor {

	public static void main(String[] args) {
		Derived dev = new Derived();

	}

}
