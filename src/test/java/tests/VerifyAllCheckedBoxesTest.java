package tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import pages.VerifyAllCheckedBoxesPage;
import testComponents.BaseTest;

public class VerifyAllCheckedBoxesTest extends BaseTest {

	VerifyAllCheckedBoxesPage allCheckBoxes;

	@Test
	public void validateAllCheckBoxes() throws InterruptedException {

		allCheckBoxes = PageFactory.initElements(driver, VerifyAllCheckedBoxesPage.class);
		allCheckBoxes.clickCheckBox();

		Assert.assertTrue(allCheckBoxes.verifyBoxesSelected());

		Thread.sleep(3000);
		tearDown();
	}

}
