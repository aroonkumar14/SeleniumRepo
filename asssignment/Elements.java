package week3.day2.asssignment;

public class Elements extends Button {

	public static void main(String[] args) {
		Elements obj = new Elements();
		obj.click();
		obj.setText("Webelement Class");
		obj.submit(); //Button class
		
		TextField obj1 = new TextField();
		obj1.click();
		obj1.setText("From Textfield");
		obj1.getText("From Textfield");
		
		
		CheckBoxButton obj2 = new CheckBoxButton();
		obj2.clickCheckButton();
		obj2.click();
		obj2.submit();
		obj2.setText("From CheckBoxButton");
		
		RadioButton obj3 = new RadioButton();
		obj3.click();
		obj3.setText("From RadioButton");
		obj3.selectRadioButton();
		obj3.submit();
		
	
		
	}

}
