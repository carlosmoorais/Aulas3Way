package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.web.model.Produto;
import com.web.util.FabricaConexao;

public class ProdutoDao {

	private static final String LISTAR_TODOS = "SELECT * FROM PRODUTO";
	private static final String INSERT_SQL = "INSERT INTO PRODUTO(NOME, DESCRICAO, VALOR, QUANTIDADE) VALUES(?, ?, ?, ?)";
	private static final String OBTER_POR_ID_SQL = "SELECT ID, NOME, DESCRICAO, VALOR, QUANTIDADE FROM PRODUTO WHERE ID = ?";
	private static final String CONSULTAR_SQL = "SELECT * FROM PRODUTO WHERE NOME ILIKE ?";
	private static final String DELETE_SQL = "DELETE FROM PRODUTO WHERE ID = ?";
	private static final String UPDATE_SQL = "UPDATE PRODUTO SET NOME = ?, DESCRICAO = ?, VALOR = ?, QUANTIDADE = ? WHERE ID = ?";




	public List<Produto> listarTodos() {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(LISTAR_TODOS);) {

			ResultSet resultado = consulta.executeQuery();

			while (resultado.next()) {
				Produto produto = new Produto();
				produto.setId(resultado.getInt("ID"));
				produto.setNome(resultado.getString("NOME"));
				produto.setDescricao(resultado.getString("DESCRICAO"));
				produto.setValor(resultado.getDouble("VALOR"));
				produto.setQuantidade(resultado.getInt("QUANTIDADE"));

				lista.add(produto);
			}

			resultado.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public void inserir(Produto produto) {
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(INSERT_SQL);){
			consulta.setString(1, produto.getNome());
			consulta.setString(2, produto.getDescricao());
			consulta.setDouble(3, produto.getValor());
			consulta.setInt(4, produto.getQuantidade());

			consulta.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeById(int produtoId) {
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(DELETE_SQL);) {

			consulta.setInt(1, produtoId);
			consulta.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Produto consultar(int produtoId) {
		Produto produto = null;
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(OBTER_POR_ID_SQL);) {
			
			consulta.setInt(1, produtoId);

			ResultSet resultado = consulta.executeQuery();

			if (resultado.next()) {
				produto = new Produto();
				produto.setId(resultado.getInt("ID"));
				produto.setNome(resultado.getString("NOME"));
				produto.setDescricao(resultado.getString("DESCRICAO"));
				produto.setValor(resultado.getDouble("VALOR"));
				produto.setQuantidade(resultado.getInt("QUANTIDADE"));
			}

			resultado.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produto;
	}

	public List<Produto> consultar(String buscarProduto) {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(CONSULTAR_SQL);) {
			consulta.setString(1, "%" + buscarProduto + "%");

			ResultSet resultado = consulta.executeQuery();

			while (resultado.next()) {
				Produto produto = new Produto();
				produto.setId(resultado.getInt("ID"));
				produto.setNome(resultado.getString("NOME"));
				produto.setDescricao(resultado.getString("DESCRICAO"));
				produto.setValor(resultado.getDouble("VALOR"));
				produto.setQuantidade(resultado.getInt("QUANTIDADE"));
				lista.add(produto);
			}

			resultado.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	public void updateProduto(Produto produto) {
		try (Connection conexao = FabricaConexao.getConexao();
				PreparedStatement consulta = conexao.prepareStatement(UPDATE_SQL);) {
			
			consulta.setString(1, produto.getNome());
			consulta.setString(2, produto.getDescricao());
			consulta.setDouble(3, produto.getValor());
			consulta.setInt(4, produto.getQuantidade());
			consulta.setInt(5, produto.getId());

			consulta.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 

}
