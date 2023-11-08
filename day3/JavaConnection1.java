package week3.day3;

public class JavaConnection1 extends JavaConnection{

	
	public static void main(String[] args) {
		JavaConnection1 jc1=new JavaConnection1();
		jc1.connect();
		jc1.executeUpdate();

	}

	public void executeUpdate() {
		System.out.println("Execute from concrete class");
		
	}

}
