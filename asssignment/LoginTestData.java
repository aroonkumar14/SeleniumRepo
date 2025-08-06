package week3.day2.asssignment;

public class LoginTestData extends TestData{

	public void enterUsername() {
		System.out.println("Entered the user name");
	}
	
	public void enterPassword() {
		System.out.println("Entered the Pass word");
	}
	
	public static void main(String[] args) {
		
		LoginTestData obj = new LoginTestData();
		obj.navigateToHomePage();
		obj.enterCredentials();
		obj.enterUsername();
		obj.enterPassword();

	}

}
