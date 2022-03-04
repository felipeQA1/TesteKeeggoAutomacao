#Author: morenofelipe448@gmail.com

@tag
Feature: Validar fluxo de cadastro e compra do site de ecomerce

  @tag1
  Scenario: abrir o site e efetuar a compra 
    Given que eu esteja no "https://www.advantageonlineshopping.com/#/"
    When responder os campos
    Then valido as informacao tirar print de envio de compra