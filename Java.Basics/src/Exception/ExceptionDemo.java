package Exception;
class Test extends Exception{}
public class ExceptionDemo {

	public static void main(String[] args) {
		try{
			throw new Test();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Inside finally");
		}

	}

}
