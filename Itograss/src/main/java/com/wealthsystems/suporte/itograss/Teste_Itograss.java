package com.wealthsystems.suporte.itograss;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

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


public class Teste_Itograss {
	
	private static final WebDriver driver = new FirefoxDriver();
	static final int quantTelas = 10;
	static List<WebDriver> lista = new ArrayList<WebDriver>();  
	//private static final WebDriver driver = new FirefoxDriver();
	
	public static void main(String[] args) throws InterruptedException {
	
	for (int i = 1; i <= quantTelas; i++) {
		String nome = "driver"+ Integer.toString(i);
		WebDriver wd = nome; 
		lista.add(nome);
		System.out.println(lista);
		
		String retorno=null;
		for (int j = 0; j < lista.size(); j++) {
			retorno = lista.get(i);
			WebDriver teste =<driver>retorno; 
			private static final WebDriver teste = new FirefoxDriver();
		}
		

	}
	}
	
}


