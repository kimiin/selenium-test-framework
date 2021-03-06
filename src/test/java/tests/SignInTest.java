package tests;

import org.testng.annotations.Test;
import utils.PropertyUtils;

public class SignInTest extends BaseTest {

	@Test(description = "Verify invalid message is displayed when using invalid email and password")
	public void verifySignIn_invalidEmailPassword_shouldPromptInvalidMessage() {
		browserKeywords.goTo(PropertyUtils.getInstance().getAutHomepage());
		homePage.goToSignInPage();
		signInPage.signIn("admin", "password");
		verificationKeywords.verifyEqual(signInPage.getErrorMessage(), "Invalid email");
	}
}
