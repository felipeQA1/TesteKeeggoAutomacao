package elementos;

import org.openqa.selenium.By;

public class ElementoCompraSpeakerPopularOffer {
	
	private By btColorBlue = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[1]");
	
	private By btColorBlack = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[2]");
	
	private By btColorPurple = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span[3]");
	
	private By btAddMore = By.className("plus");
	
	private By btAddCart = By.name("save_to_cart");
	
	private By cpCheckout = By.id("checkOutPopUp");
	
	private By cpHome = By.cssSelector("body > div.uiview.ng-scope > nav > a.ng-scope");
	
	public By getBtColorBlue() {
		return btColorBlue;
	}

	public By getBtColorBlack() {
		return btColorBlack;
	}

	public By getBtColorPurple() {
		return btColorPurple;
	}

	public By getBtAddMore() {
		return btAddMore;
	}

	public By getBtAddCart() {
		return btAddCart;
	}

	public By getCpCheckout() {
		return cpCheckout;
	}

	public By getCpHome() {
		return cpHome;
	}

	

}
