package Static;
class Base{
	public  static void display(){
		System.out.println("Base: display");
	}
	public void print(){
		System.out.println("Base: print");
	}
}
class Derived extends Base{
	public  static void display(){
		System.out.println("Derived: display");
	}
	public void print(){
		System.out.println("Derived: print");
	}
}
public class OverrideStaticMethod {

	public static void main(String[] args) {
		Base base = new Derived();
		base.print();
		base.display();

	}

}
