package com.wealthsystems.suporte.itograss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static Connection conexao;

	private static void criarConexao() {

		String connectionURL = "jdbc:postgresql://postgresql8402.ws1:8400/" + "public_sim3g_itograss_2015_12_15";

		try {

			Class.forName("org.postgresql.Driver");

			conexao = DriverManager.getConnection(connectionURL, "wssim", "18012001");

			System.out.println("Conexão obtida com sucesso");

		} catch (SQLException ex) {

			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLException: " + ex.getSQLState());
			System.out.println("SQLException: " + ex.getErrorCode());

		} catch (Exception e) {

			System.out.println("Não foi possivel conectar com o banco");

		}

	}

	public static Connection getConexao() {
		if (conexao == null) {
			criarConexao();
		}
		return conexao;
	}

}