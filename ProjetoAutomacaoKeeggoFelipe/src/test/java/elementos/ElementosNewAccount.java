package elementos;

import org.openqa.selenium.By;

public class ElementosNewAccount {
	
	private By cpUsername = By.name("usernameRegisterPage");
	
	private By cpEmail = By.name("emailRegisterPage");
	
	private By cpPassword = By.name("passwordRegisterPage");
	
	private By cpConfirmPassword = By.name("confirm_passwordRegisterPage");
	
	private By cpFirstName = By.name("first_nameRegisterPage");
	
	private By cpLastName = By.name("last_nameRegisterPage");
	
	private By cpPhoneNumber = By.name("phone_numberRegisterPage");
	
	private By cpCountry = By.name("countryListboxRegisterPage");
	
	private By btCountry = By.cssSelector("#formCover > div:nth-child(3) > div:nth-child(2) > sec-view:nth-child(1) > div > select > option:nth-child(30)");
	
	private By cpCity = By.name("cityRegisterPage");
	
	private By cpAddress = By.name("addressRegisterPage");
	
	private By cpStateProvinceRegion = By.name("state_/_province_/_regionRegisterPage");
	
	private By cpPostalCode = By.name("postal_codeRegisterPage");
	
	private By btAgree = By.xpath("//*[@id=\"formCover\"]/sec-view/div/input");
	
	private By btRegister = By.id("register_btnundefined");

	public By getCpUsername() {
		return cpUsername;
	}

	public By getCpEmail() {
		return cpEmail;
	}

	public By getCpPassword() {
		return cpPassword;
	}

	public By getCpConfirmPassword() {
		return cpConfirmPassword;
	}

	public By getCpFirstName() {
		return cpFirstName;
	}

	public By getCpLastName() {
		return cpLastName;
	}

	public By getCpPhoneNumber() {
		return cpPhoneNumber;
	}
	public By getCpCountry(){
		return cpCountry;
	}

	public By getBtCountry() {
		return btCountry;
	}

	public By getCpCity() {
		return cpCity;
	}

	public By getCpAddress() {
		return cpAddress;
	}

	public By getCpStateProvinceRegion() {
		return cpStateProvinceRegion;
	}

	public By getCpPostalCode() {
		return cpPostalCode;
	}

	public By getBtAgree() {
		return btAgree;
	}

	public By getBtRegister() {
		return btRegister;
	}
	
}
