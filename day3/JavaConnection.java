package week3.day3;

public abstract class JavaConnection implements DatabaseConnection{
	
	public void connect() {
		System.out.println("TO connect from Database Connection");
		
	}

	public void disconnect() {
		System.out.println("TO disconnect from Database Connection");
		
	}
	
	

}


