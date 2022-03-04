package elementos;

import org.openqa.selenium.By;

public class ElementosHomeCompra {
	
	private By btSpecialOffer = By.xpath("/html/body/header/nav/ul/li[7]/a");
	
	private By btPopularItems = By.xpath("/html/body/header/nav/ul/li[6]/a");
	
	private By btOurProducts = By.xpath("/html/body/header/nav/ul/li[8]/a");
	
	private By btOfferBuy = By.id("see_offer_btn");
	
	private By btPopularTablet = By.id("details_16");
	
	private By btPopularNote = By.id("details_10");
	
	private By btPopularSpeaker = By.id("details_21");

	public By getBtSpecialOffer() {
		return btSpecialOffer;
	}

	public By getBtPopularItems() {
		return btPopularItems;
	}
	public By getOurProducts() {
		return btOurProducts;
	}

	public By getBtOfferBuy() {
		return btOfferBuy;
	}

	public By getBtPopTablet() {
		return btPopularTablet;
	}

	public By getBtPopNote() {
		return btPopularNote;
	}

	public By getBtPopSpeaker() {
		return btPopularSpeaker;
	}
	
	

}
