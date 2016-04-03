package Variables;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Sayantan";
		String s2="Guha";
		System.out.println(s1.length());
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(2));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(2, 8));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.trim());
		System.out.println(s1.replace('y', 'f'));
	}

}
