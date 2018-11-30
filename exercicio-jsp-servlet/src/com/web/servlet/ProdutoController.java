package com.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.dao.ProdutoDao;
import com.web.model.Produto;

@WebServlet("/ProdutoController")
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String INSERIR_OU_EDITAR = "/produto.jsp";
	private static final String LISTAR_PRODUTOS = "/listarProdutos.jsp";
       
	private ProdutoDao dao = new ProdutoDao();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String pagina = "";
		String action = request.getParameter("action");
		String buscarProduto = request.getParameter("buscarProduto");

		if (action != null && action.equalsIgnoreCase("deletar")) {
			int produtoId = Integer.parseInt(request.getParameter("produtoId"));
			dao.removeById(produtoId);
			pagina = LISTAR_PRODUTOS;
			request.setAttribute("produtos", dao.listarTodos());
		} else if (action != null && action.equalsIgnoreCase("editar")) {
			pagina = INSERIR_OU_EDITAR;
			int produtoId = Integer.parseInt(request.getParameter("produtoId"));
			Produto produto = dao.consultar(produtoId);
			request.setAttribute("produto", produto);
		} else if (action != null && action.equalsIgnoreCase("listarProdutos")) {
			pagina = LISTAR_PRODUTOS;
			request.setAttribute("produtos", dao.listarTodos());
		} else if (buscarProduto != null) {
			List<Produto> produtos = dao.consultar(buscarProduto);
			request.setAttribute("produtos", produtos);
			pagina = LISTAR_PRODUTOS;
		} else {
			pagina = INSERIR_OU_EDITAR;
		}

		RequestDispatcher view = request.getRequestDispatcher(pagina);
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Produto produto = new Produto();
		produto.setNome(request.getParameter("nome"));
		produto.setDescricao(request.getParameter("descricao"));
		produto.setValor(request.getParameter("valor") != null ? Double.parseDouble(request.getParameter("valor")) : 0);
		produto.setQuantidade(Integer.parseInt(request.getParameter("quantidade")));
		String codigoProduto = request.getParameter("idProduto");

		if ((codigoProduto == null || codigoProduto.isEmpty())) {
			dao.inserir(produto);
			request.setAttribute("produtos", dao.listarTodos());
		} else {
			produto.setId(Integer.parseInt(codigoProduto));
			dao.updateProduto(produto);
			request.setAttribute("produtos", dao.listarTodos());
		}
		
		RequestDispatcher view = request.getRequestDispatcher(LISTAR_PRODUTOS);
		view.forward(request, response);
	}

}
