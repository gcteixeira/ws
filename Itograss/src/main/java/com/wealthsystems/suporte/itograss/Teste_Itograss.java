package com.wealthsystems.suporte.itograss;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste_Itograss {

	private static final WebDriver driver = new FirefoxDriver();
	static final int quantTelas = 20;
	static List<WebDriver> lista = new ArrayList<WebDriver>();

	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= quantTelas; i++) {
			new Thread(new Runnable() {
				public void run() {
					try {
						new GeraPedido().criaPedido(new FirefoxDriver());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}
}
