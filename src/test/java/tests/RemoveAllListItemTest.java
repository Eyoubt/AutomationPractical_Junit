package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveAllListItemPage;
import testComponents.BaseTest;

public class RemoveAllListItemTest extends BaseTest {

	RemoveAllListItemPage remove;

	@Test
	public void removeAllitem() throws Throwable {

		remove = PageFactory.initElements(driver, RemoveAllListItemPage.class);

		remove.clickAllToggle();
		remove.removeBtn();

		Assert.assertFalse("WebElement doesn't exist", remove.checkItemsExist());
		tearDown();
	}

}
