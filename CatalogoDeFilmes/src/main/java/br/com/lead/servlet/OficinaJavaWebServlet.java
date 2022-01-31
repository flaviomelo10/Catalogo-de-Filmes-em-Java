package br.com.lead.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lead.modelo.Filme;

@WebServlet("/oficina-filme")
public class OficinaJavaWebServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Filme interestelar = new Filme("Interestelar", "Ficção Científica", 2014);
		Filme avidaeagora = new Filme("A Vida é Agora", "Comédia", 2021);
		Filme aguerradosconsoles = new Filme("A Guerra dos Consoles", "Documentário", 2020);
		Filme kong= new Filme("Kong: A Ilha da Caveira", "Ação", 2017);
		Filme benjamim = new Filme("O Curioso Caso de Benjamim Button", "Drama", 2008);
		Filme exorcista = new Filme("O Exorcista", "Terror", 1973);
		
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		
		filmes.add(interestelar);
		filmes.add(avidaeagora);
		filmes.add(aguerradosconsoles);
		filmes.add(kong);
		filmes.add(benjamim);
		filmes.add(exorcista);
		
		String Ano = req.getParameter("Ano");
		int anoInt = Integer.valueOf(Ano);
		
		resp.setContentType("text/HTML");
		PrintWriter out = resp.getWriter();
		
		out.println("<h2> Minha lista de filmes utilizando Servlets - Oficina Java Front/Back Aula 1.3 </h2>");
		
		out.println("<ol>");
		
		filmes.forEach(filme -> { if(filme.getAno() >= anoInt) {
			out.println(String.format("<li> Nome: %s", filme.getNome()));
			out.println(String.format("Gênero: %s", filme.getGenero()));
			out.println(String.format("Ano: %s </li>", filme.getAno()));
		}});
		out.println("</ol>");
		out.close();
	}
}
