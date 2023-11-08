package week3.day3;

public class LoginPage extends BasePage{

	public void performCommonTasks() {
		System.out.println("Used to perform Common Task in Login Page");
	}
	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.performCommonTasks();
		lp.clickElement();
		lp.findElement();
		lp.enterText();

	}

}
