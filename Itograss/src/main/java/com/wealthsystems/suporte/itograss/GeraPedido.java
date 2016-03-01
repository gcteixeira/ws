package com.wealthsystems.suporte.itograss;

import java.util.List;
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

public class GeraPedido {

	private static final WebDriver driver = new FirefoxDriver();
	static final int quantTelas = 10;
	private static final List<String> List = null;
	
	
	public static void main(String[] args) throws InterruptedException {
		
	for (int i = 0; i < quantTelas; i++) {
		String nome = "driver";
		String posicao = Integer.toString(i);
		List.add(i, nome+posicao);
		}
	
		
		
		for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i));
		}
		
		
		

	
//			Validacao validacao;
//			String	valorValidacao = Validacao.resul;  
//		
//		// informa o link para acessar a WEb
//		driver.get("http://localhost:8080/itograss/ID_/login.form.ws");
//
//		WebElement txtLogin = fluentWait(By.id("formusuario"));
//		WebElement txtSenha = fluentWait(By.id("formsenha"));
//		WebElement btnLogar = fluentWait(By.id("btnGravar"));
//
//		driver.manage().window().maximize();
//		// logar na aplicação
//
//		txtLogin.sendKeys("admin");
//		txtSenha.sendKeys("12");
//		btnLogar.click();
//
//		// acessar o menu de pedidos
//		WebElement btnPedido = fluentWait(By.cssSelector("div.menu-item.pedido"));
//		btnPedido.click();
//
//		// Criar um novo pedido
//		WebElement btnNovo = fluentWait(By.cssSelector("a[href*='/itograss/ID_/pedido/cadastro.novo.ws']"));
//		btnNovo.click();
//
//		// Selecionar um parceiro
//		WebElement btnPesquisaParceiro = fluentWait(By.xpath("//*[@id='formPedido']/div[1]/ul/li[3]/div/div/div/a[1]/img"));
//		btnPesquisaParceiro.click();
//
//		// Informa o nome do parceiro 
//		WebElement campoTextoPesquisasSelecinarCliente = fluentWait(By.xpath("/html/body/div[7]/div[2]/form/input"));
//		campoTextoPesquisasSelecinarCliente.sendKeys("ALVES BARRETO COM");
//
//		WebElement btnPesquisasSelecinarCliente = fluentWait(By.xpath("/html/body/div[7]/div[2]/form/button"));
//		btnPesquisasSelecinarCliente.click();
//
//		WebElement pPesquisasSelecinarCliente = fluentWait(By.xpath("/html/body/div[7]/div[2]/div[2]/div[4]/div/div/div[1]"));
//		pPesquisasSelecinarCliente.click();
//
//		WebElement tablePesquisasSelecinarCliente = fluentWait(By.xpath("/html/body/div[7]/div[2]/div[4]/button/span"));
//		tablePesquisasSelecinarCliente.click();
//		
//		Thread.sleep(2000);
//		
//		// selecionar a forma de pagamento
//		Select selectBox = new Select(fluentWait(By.xpath("//*[@id='cmbTipoCobranca']")));
//		selectBox.getAllSelectedOptions();
//		selectBox.selectByIndex(6);
//		
//		// Numero pedido cliente
//		WebElement numeroPedidoCliente = fluentWait(By.id("numPedidoCliente"));
//		Thread.sleep(2000);
//		numeroPedidoCliente.click();
//		numeroPedidoCliente.sendKeys("21321312");
//
//		Thread.sleep(2000);
//
//		// Abre a pesquisa de produto na Grid
//
//		WebElement pesquisasSelecinarProduto = driver.findElement(By.xpath("//*[@id='produtos']/div/div[4]/div/div/div[1]"));
//		pesquisasSelecinarProduto.click();
//
//		Thread.sleep(2000);
//		
//		fluentWait((By.xpath("//*[@id='produtos']/div/div[4]/div"))).sendKeys(Keys.ENTER);
//		
//		WebElement pesquisasSelecinarProdutoDaGrid = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div/div[1]/a/span"));
//		pesquisasSelecinarProdutoDaGrid.click();
//
//		WebElement textoSelecinarProduto = fluentWait(By.xpath("/html/body/div[8]/div[2]/form/input"));
//		//textoSelecinarProduto.sendKeys("BERMUDA");
//		textoSelecinarProduto.sendKeys("CELEBRATION");
//
//		WebElement pesquisaSelecinarProduto = fluentWait(By.xpath("/html/body/div[8]/div[2]/form/button/span[1]"));
//		pesquisaSelecinarProduto.click();
//
//		WebElement gridpesquisaproduto = fluentWait(By.xpath("/html/body/div[8]/div[2]/div[2]/div[4]/div/div/div[1]"));
//		gridpesquisaproduto.click();
//
//		WebElement botaopesquisaproduto = fluentWait(By.xpath("//html/body/div[8]/div[2]/div[4]/button/span"));
//		botaopesquisaproduto.click();
//
//		WebElement gripquantidadepedido = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div/div[3]"));
//		gripquantidadepedido.click();
//
//		WebElement gripquantidadepedido1 = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div"));
//		gripquantidadepedido1.click();
//		
//		Thread.sleep(2000);
//
//		fluentWait((By.xpath("//*[@id='produtos']/div/div[4]/div"))).sendKeys(Keys.ENTER);
//		
//		//Coloca valor na celula de quantidade de produtos
//
//		WebElement gripquantidadepedido2 = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div[2]/div[3]/input"));
//		gripquantidadepedido2.sendKeys("10");
//		fluentWait((By.xpath("//*[@id='produtos']/div/div[4]/div"))).sendKeys(Keys.TAB);
//		Thread.sleep(2000);
//		
//		Actions action = new Actions(driver);
//		//Coloca o  Preço final 
//		
//		WebElement gridPrecoFinal= fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div[2]/div[5]")); 
//		gridPrecoFinal.click();
//		//action.doubleClick(gridPrecoFinal);
//		
//		WebElement gridPrecoFinal1= fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div[2]/div[5]/input")); 
//		gridPrecoFinal1.sendKeys("10");
//		
//		Thread.sleep(2000);
//
//		
//		// Numero pedido cliente no produto
//		fluentWait((By.xpath("//*[@id='produtos']/div/div[4]/div/div[2]/div[5]/input"))).sendKeys(Keys.TAB);
//		Thread.sleep(2000);
//		WebElement gridNumeroPedidoCliente = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div[2]/div[9]"));
//		gridNumeroPedidoCliente.click();
//		fluentWait((By.xpath("//*[@id='produtos']/div/div[4]/div/div[2]/div[9]"))).sendKeys(Keys.ENTER);
//		WebElement gridNumeroPedidoCliente1 = fluentWait(By.xpath("//*[@id='produtos']/div/div[4]/div/div[2]/div[9]/input"));
//		Thread.sleep(2000);
//		gridNumeroPedidoCliente1.sendKeys("456");
//		
//		
//	
//		//abre a aba de entregas 
//		
//		WebElement expandirEntrega = fluentWait(By.xpath("//*[@id='entregaPanel']/h3/span[1]"));
//		expandirEntrega.click();
//		
//		//local
//		
////		WebElement localEntrega = fluentWait(By.xpath("//*[@id='entregaPanel']/div/div[4]/div/div/div[2]"));
////		localEntrega.click();
////		driver.findElement(By.xpath("//*[@id='entregaPanel']/div/div[4]/div/div/div[2]")).sendKeys(Keys.TAB);
//		
//		//campo valor do frete
//		WebElement valorFrete = fluentWait(By.xpath("//*[@id='entregaPanel']/div/div[4]/div/div/div[3]"));   
//		valorFrete.click();
//		action.doubleClick(valorFrete).perform();
//
//
//
//		WebElement valorFrete1 = fluentWait(By.xpath("//*[@id='entregaPanel']/div/div[4]/div/div/div[3]/input"));
//		valorFrete1.click();
//		valorFrete1.sendKeys("10");
//
//		
//		
//		WebElement entFutura = fluentWait(By.xpath("//*[@id='entregaPanel']/div/div[4]/div/div/div[4]"));
//		entFutura.click();
//		
//		Thread.sleep(2000);
//
//		WebElement btnSalvar = fluentWait(By.xpath("//*[@id='btnGravar']/span"));
//		btnSalvar.click();
//
//		System.out.println("Você chegou ao final do pedido!");
//		
//		System.out.println("teste");
//		
//
//				if (gridpesquisaproduto.getTagName().equals(valorValidacao)) {
//					System.out.println("Produto Igual o a SQL");
//				}else {
//					System.out.println("Produto diferente do SQL");
//				}
//			}
//
//	public static WebElement fluentWait(final By locator) {
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
//				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
//
//		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {                                                                                                          
//			public WebElement apply(WebDriver driver) {
//				return driver.findElement(locator);
//			}
//		});
//
//		return foo;
//	}
//
//	public static WebDriver getDriver() {
//		return driver;
//	};
	}
}
