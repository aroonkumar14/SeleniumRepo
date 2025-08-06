package week3.day2.asssignment;

public class LoginPage extends BasePage {

	@Override
	public void performCommonTasks() {
		super.performCommonTasks();
		System.out.println("Overriding the Perfom common Tasks");
	}

	public static void main(String[] args) {

		LoginPage obj = new LoginPage();
		obj.clickElement();
		obj.enterText();
		obj.findElement();
		obj.performCommonTasks();

	}

}
