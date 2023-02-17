package pages;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerifyAllCheckedBoxesPage {

	WebDriver driver;
	boolean allSelected;

	public VerifyAllCheckedBoxesPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "input[name='allbox']")
	WebElement toggleAllBox;

	public void clickCheckBox() {
		toggleAllBox.click();
	}

	public boolean verifyBoxesSelected() {
		List<WebElement> chk = driver.findElements(By.cssSelector("input[type='checkbox']"));
		Iterator<WebElement> itr = chk.iterator();
		while (itr.hasNext()) {
			if (!itr.next().isSelected())
				allSelected = false;
			else
				allSelected = true;
		}

		return allSelected;
	}

}
