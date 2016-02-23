package com.wealthsystems.suporte.itograss;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.selenium.webdriven.commands.GetValue;

public class Validacao {
	static Connection con;
	static PreparedStatement stmt;
	static String sql;
	private static List testes;

	public static void main(String[] args) throws SQLException {
		List<String> resultado = getInformacao();
		for (String nomeParceiro : resultado) {
			System.out.println(nomeParceiro);
		}
	}

	private static Connection conexao;

	public static List<String> getInformacao() {
		conexao = Conexao.getConexao();
		try {
			sql = "select p.descricao from PRODUTOFILIAL pf left join produto p on p.idproduto = pf.idproduto 	left join local l on pf.IDLOCALFILIAL = L.IDLOCAL  where idlocal=11";
			stmt = conexao.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			List testes = new ArrayList<String>();
			while (result.next()) {
				testes.add(result.getString(1)); // testes.add(result.getString(1)+"
													// - "+result.getString(2));
			}
			result.close();
			stmt.close();
			return testes;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return testes;

	}

}
