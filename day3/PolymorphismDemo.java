package week3.day3;

public class PolymorphismDemo {
	public void reportStep(String msg, String status) {
		System.out.println("Report Status :" + msg + " " + status);

	}

	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("Report Status :" + msg + " " + status + " " + snap);

	}

	public static void main(String[] args) {
		PolymorphismDemo poly = new PolymorphismDemo();
		poly.reportStep("Status", "Passed");
		poly.reportStep("Status", "Failed", false);
	}
}
