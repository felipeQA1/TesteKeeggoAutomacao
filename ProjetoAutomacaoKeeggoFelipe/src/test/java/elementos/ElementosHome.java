package elementos;

import org.openqa.selenium.By;

public class ElementosHome {
	
	private By btLogin = By.xpath("//*[@id=\"menuUser\"]");
	
	private By cpUsername = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input");
	
	private By cpPassword = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input");
	
	private By btSigIn = By.xpath("//*[@id=\"sign_in_btnundefined\"]");
	
	private By CreateNewAccount = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");

	public By getBtLogin() {
		return btLogin;
	}

	public By getCpUsername() {
		return cpUsername;
	}

	public By getCpPassword() {
		return cpPassword;
	}

	public By getBtSigIn() {
		return btSigIn;
	}

	public By getCreateNewAccount() {
		return CreateNewAccount;
	}
	

}
