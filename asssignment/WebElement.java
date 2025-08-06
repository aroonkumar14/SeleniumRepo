package week3.day2.asssignment;

public class WebElement {

	public void  click() {
		System.out.println("This is from Webelement class : Click");
	}
	
	public String setText(String text) {
		System.out.println("This is from Webelement class : " + text);
		return text;	
	}
}
