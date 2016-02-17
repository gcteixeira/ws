package com.wealthsystems.suporte.itograss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Teste_Itograss {
	private static final WebDriver driver = new FirefoxDriver();;

	public static void main(String[] args) throws InterruptedException {

		// informa o link para acessar a WEb
		driver.get("http://localhost:8080/itograss/ID_/login.form.ws");

		WebElement txtLogin = fluentWait(By.id("formusuario"));
		WebElement txtSenha = fluentWait(By.id("formsenha"));
		WebElement btnLogar = fluentWait(By.id("btnGravar"));

		// logar na aplicação

		txtLogin.sendKeys("REP12");
		txtSenha.sendKeys("12");
		btnLogar.click();

		// acessar o menu de pedidos
		WebElement btnPedido = fluentWait(By.cssSelector("div.menu-item.pedido"));
		btnPedido.click();

		// Criar um novo pedido
		WebElement btnNovo = fluentWait(By.cssSelector("a[href*='/itograss/ID_/pedido/cadastro.novo.ws']"));
		btnNovo.click();

		// Selecionar um parceiro
		WebElement btnPesquisaParceiro = fluentWait(By.xpath("//*[@id='formPedido']/div[1]/ul/li[3]/div/div/div/a[1]/img"));
		btnPesquisaParceiro.click();

		WebElement campoTextoPesquisasSelecinarCliente = fluentWait(By.xpath("/html/body/div[7]/div[2]/form/input"));
		campoTextoPesquisasSelecinarCliente.sendKeys("ALVES BARRETO COM");

		WebElement btnPesquisasSelecinarCliente = fluentWait(By.xpath("/html/body/div[7]/div[2]/form/button"));
		btnPesquisasSelecinarCliente.click();

		WebElement pPesquisasSelecinarCliente = fluentWait(By.xpath("/html/body/div[7]/div[2]/div[2]/div[4]/div/div/div[1]"));
		pPesquisasSelecinarCliente.click();

		WebElement tablePesquisasSelecinarCliente = fluentWait(By.xpath("/html/body/div[7]/div[2]/div[4]/button/span"));
		tablePesquisasSelecinarCliente.click();

		// selecionar a forma de pagamento
		Select selectBox = new Select(fluentWait(By.xpath("//*[@id='cmbTipoCobranca']")));
		selectBox.getAllSelectedOptions();
		selectBox.selectByIndex(1);
		
		
		WebElement numeroPedidoCliente = fluentWait(By.id("numPedidoCliente"));
		Thread.sleep(2000);
		numeroPedidoCliente.click();
		numeroPedidoCliente.sendKeys("21321312");
		
		while(!numeroPedidoCliente.getText().equals("")){
			if(!numeroPedidoCliente.getText().equals("21321312")){
				System.out.println("esta aguardando preencher");
				continue;
			}
			numeroPedidoCliente.sendKeys("21321312");
			break;
		}
		

		// Abre a pesquisa de produto na Grid
		Actions action = new Actions(driver);
		WebElement pesquisasSelecinarProduto = driver.findElement(By.xpath("//*[@id='produtos']/div/div[4]/div/div/div[1]"));
		Thread.sleep(2000);
		pesquisasSelecinarProduto.click();

		System.out.println("teste 1");
		Thread.sleep(2000);
		//pesquisasSelecinarProduto.sendKeys(Keys.ENTER);
		fluentWait((By.xpath("//*[@id='produtos']/div/div[4]/div/div/div[1]"))).sendKeys(Keys.ENTER);
		//*[@id="produtos"]/div/div[4]/div/div/div[1]
		//action.doubleClick(pesquisasSelecinarProduto).perform();
		System.out.println("teste 2");

	

		WebElement pesquisasSelecinarProdutoDaGrid = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div/div[1]/a/span"));
		pesquisasSelecinarProdutoDaGrid.click();

		WebElement textoSelecinarProduto = fluentWait(By.xpath("/html/body/div[8]/div[2]/form/input"));
		textoSelecinarProduto.sendKeys("BERMUDA");

		WebElement pesquisaSelecinarProduto = fluentWait(By.xpath("/html/body/div[8]/div[2]/form/button/span[1]"));
		pesquisaSelecinarProduto.click();

		WebElement gridpesquisaproduto = fluentWait(By.xpath("/html/body/div[8]/div[2]/div[2]/div[4]/div/div/div[1]"));
		gridpesquisaproduto.click();

		WebElement botaopesquisaproduto = fluentWait(By.xpath("//html/body/div[8]/div[2]/div[4]/button/span"));
		botaopesquisaproduto.click();

		WebElement gripquantidadepedido = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div/div[3]"));
		gripquantidadepedido.click();

		WebElement gripquantidadepedido1 = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div"));
		gripquantidadepedido1.click();

		fluentWait((By.xpath("//*[@id='produtos']/div/div[4]/div"))).sendKeys(Keys.ENTER);

		WebElement gripquantidadepedido2 = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div[2]/div[3]/input"));
		gripquantidadepedido2.sendKeys("10");

		WebElement expandirEntrega = fluentWait(By.xpath("//*[@id='entregaPanel']/h3/span[1]"));
		expandirEntrega.click();

		WebElement valorFrete = fluentWait(By.xpath("//*[@id='entregaPanel']/div/div[4]/div/div/div[3]"));
		valorFrete.click();

		action.doubleClick(valorFrete).perform();

		WebElement valorFrete1 = fluentWait(By.xpath("//*[@id='entregaPanel']/div/div[4]/div/div/div[3]/input"));
		valorFrete1.click();

		action.doubleClick(valorFrete1).perform();

		valorFrete1.sendKeys("10");

		WebElement entFutura = fluentWait(By.xpath("//*[@id='entregaPanel']/div/div[4]/div/div/div[4]"));
		entFutura.click();

		WebElement btnSalvar = fluentWait(By.xpath("//*[@id='btnGravar']/span"));
		btnSalvar.click();

		// *[@id="jGrowl"]/div

		System.out.println("Você chegou ao final do seu teste!");

	}

	public static WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});

		return foo;
	};
}