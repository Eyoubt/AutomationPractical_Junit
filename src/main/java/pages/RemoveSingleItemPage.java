package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveSingleItemPage {

	WebDriver driver;

	public RemoveSingleItemPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='todo[1]']")
	WebElement singleCheckBox;

	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement removeBtn;

	public void check_Single_Item() {
		singleCheckBox.click();
	}

	public boolean checkItemExists() {
		try {
			return singleCheckBox.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void remove_Single_Item() {
		removeBtn.click();

	}

}
