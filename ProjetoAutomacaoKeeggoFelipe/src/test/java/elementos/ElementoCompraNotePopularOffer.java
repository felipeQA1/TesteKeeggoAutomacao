package elementos;

import org.openqa.selenium.By;

public class ElementoCompraNotePopularOffer {
	
	private By btColorGray = By.xpath("/html/body/div[3]/section/article[1]/div[2]/div[2]/div/div[1]/div[2]/span");
	
	private By btAddMore = By.className("plus");
	
	private By btAddCart = By.name("save_to_cart");
	
	private By cpCheckout = By.id("checkOutPopUp");
	
	private By cpHome = By.cssSelector("body > div.uiview.ng-scope > nav > a.ng-scope");

	public By getBtColorGray() {
		return btColorGray;
	}

	public By getBtAddMore() {
		return btAddMore;
	}

	public By getBtAddCart() {
		return btAddCart;
	}

	public By getCpHome() {
		return cpHome;
	}

	public By getCpCheckout() {
		return cpCheckout;
	}
	
	

}
