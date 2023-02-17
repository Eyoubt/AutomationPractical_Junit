package pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllListItemPage {

	WebDriver driver;

	public RemoveAllListItemPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement toggleAllCheckbox;

	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement removeBtn;

	@FindBy(how = How.XPATH, using = "//form[@name='todo']//ul/li")
	WebElement singleCheckBoxes;

	public void clickAllToggle() {
		toggleAllCheckbox.click();
	}

	public void removeBtn() {
		removeBtn.click();

	}

	public boolean checkItemsExist() {
		try {
			return singleCheckBoxes.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
