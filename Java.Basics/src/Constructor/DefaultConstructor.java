package Constructor;
class Default {
	int i;
	boolean bool;
	byte b;
	Default dcnt;
}
public class DefaultConstructor {
	
	public static void main(String[] args) {
		Default dt = new Default();
		System.out.println(dt.i);
		System.out.println(dt.bool);
		System.out.println(dt.b);
		System.out.println(dt.dcnt);

	}

}
