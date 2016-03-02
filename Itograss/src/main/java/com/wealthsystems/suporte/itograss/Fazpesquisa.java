package com.wealthsystems.suporte.itograss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fazpesquisa {
	
	WebDriver driver = null;

	public void pesquisaPedido(WebDriver driver) throws InterruptedException {
		this.driver = driver;
		driver.get("http://localhost:8080/itograss/ID_/login.form.ws");
		String valorValidacao = Validacao.resul;

		// informa o link para acessar a WEb
		driver.get("http://localhost:8080/itograss/ID_/login.form.ws");

		WebElement txtLogin = fluentWait(By.id("formusuario"));
		WebElement txtSenha = fluentWait(By.id("formsenha"));
		WebElement btnLogar = fluentWait(By.id("btnGravar"));

		driver.manage().window().maximize();
		// logar na aplicação

		txtLogin.sendKeys("admin");
		txtSenha.sendKeys("12");
		btnLogar.click();

		// acessar o menu de pedidos
		WebElement btnPedido = fluentWait(By.cssSelector("div.menu-item.pedido"));
		btnPedido.click();

		WebElement btnPesquisa= fluentWait(By.xpath("//*[@id='btnPesquisar']/span[2]"));
		btnPesquisa.click();


	}

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});

		return foo;
	}

}
