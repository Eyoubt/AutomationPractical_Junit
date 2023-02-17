package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveSingleItemPage;
import testComponents.BaseTest;


public class RemoveSingleItemTest extends BaseTest {

	RemoveSingleItemPage remove;

	@Test
	public void removeSingleitem() throws Throwable {

		remove = PageFactory.initElements(driver, RemoveSingleItemPage.class);

		remove.check_Single_Item();
		remove.remove_Single_Item();

		Assert.assertFalse("WebElement doesn't exist", remove.checkItemExists());

		tearDown();
	}

}
