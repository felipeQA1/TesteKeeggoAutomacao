package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.ElementoCompraNoteEsOffer;
import elementos.ElementoCompraNotePopularOffer;
import elementos.ElementoCompraSpeakerPopularOffer;
import elementos.ElementoCompraTabletPopularOffer;
import elementos.ElementosFinalizarCompra;
import elementos.ElementosHome;
import elementos.ElementosHomeCompra;
import elementos.ElementosNewAccount;
import elementos.ElementosOrderPayment;
import pages.Metodos;

public class Steps {
	
	Metodos Met = new Metodos();
	ElementoCompraNoteEsOffer noteSpc = new ElementoCompraNoteEsOffer();
	ElementoCompraNotePopularOffer notePop = new ElementoCompraNotePopularOffer();
	ElementoCompraSpeakerPopularOffer speakerPop = new ElementoCompraSpeakerPopularOffer();
	ElementoCompraTabletPopularOffer tabletPop = new ElementoCompraTabletPopularOffer();
	ElementosFinalizarCompra finalizar = new ElementosFinalizarCompra();
	ElementosHome home = new ElementosHome();
	ElementosHomeCompra compra = new ElementosHomeCompra();
	ElementosNewAccount conta = new ElementosNewAccount();
	ElementosOrderPayment pagar = new ElementosOrderPayment();
	
	
	
	@Given("^que eu esteja no \"([^\"]*)\"$")
	public void que_eu_esteja_no(String site) throws Throwable {
		Met.abrirSite(site, "CHROME");
        Met.pausa(4000);
		Met.clicar(home.getBtLogin());
		Met.pausa(2000);
		Met.clicar(home.getCreateNewAccount());
		Met.pausa(2000);
		Met.prencher(conta.getCpUsername(), Met.getNome("fel"));
		Met.prencher(conta.getCpEmail(), Met.getEmail());
		Met.prencher(conta.getCpPassword(), "c1524C");
		Met.prencher(conta.getCpConfirmPassword(), "c1524C");
		Met.prencher(conta.getCpFirstName(), Met.getNome("Nico"));
		Met.prencher(conta.getCpLastName(), Met.getNome("And"));
		Met.prencher(conta.getCpPhoneNumber(), "15245127485");
		Met.clicar(conta.getCpCountry());
		Met.pausa(2000);
		Met.clicar(conta.getBtCountry());
		Met.prencher(conta.getCpCity(), "São Paulo");
		Met.prencher(conta.getCpAddress(), "R. São paulo ");
		Met.prencher(conta.getCpStateProvinceRegion(), "São Paulo");
		Met.prencher(conta.getCpPostalCode(), Met.getNumero());
		Met.clicar(conta.getBtAgree());
		Met.clicar(conta.getBtRegister());		
	  
	}

	@When("^responder os campos$")
	public void responder_os_campos() throws Throwable {
		Met.pausa(2000);
		Met.clicar(compra.getBtPopTablet());
		Met.pausa(2000);
		Met.clicar(tabletPop.getBtColorTabletGray());
		Met.clicar(tabletPop.getBtAddMore());
		Met.clicar(tabletPop.getBtAddCart());
		Met.pausa(2000);
		Met.clicar(tabletPop.getCpHome());
		Met.pausa(2000);
		Met.clicar(compra.getBtPopSpeaker());
		Met.pausa(2000);
		Met.clicar(speakerPop.getBtColorBlack());
		Met.pausa(2000);
		Met.clicar(speakerPop.getBtAddCart());
		Met.pausa(2000);
		Met.clicar(finalizar.getBtCheckout());
		Met.pausa(4000);
	    
	}

	@Then("^valido as informacao tirar print de envio de compra$")
	public void valido_as_informacao_tirar_print_de_envio_de_compra() throws Throwable {
		Met.clicar(pagar.getDetailsBtNext());
		Met.clicar(pagar.getBtChoosePaymentMasterCredit());
		Met.prencher(pagar.getCpMasterCardNumber(),"1244 6658 9875");
		Met.pausa(2000);
		Met.prencher(pagar.getCpMasterCvvNumber(), "5895");
		Met.prencher(pagar.getCpCardholderName(), Met.getCardholder("nic"));
		Met.clicar(pagar.getBtExpirationDateMonth8());
		Met.clicar(pagar.getBtExpirationDateYear2023());
		Met.clicar(pagar.getBtPayNow());
		Met.pausa(4000);
		Met.screnShoot("CT-Valição de compra por cartão de credito");
		Met.fechar();
	}



}
