package br.edu.senaisp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calc")
public class OlaMundo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String operacao = req.getParameter("oper");
			int v1 = Integer.parseInt(req.getParameter("val1"));
			int v2 = Integer.parseInt(req.getParameter("val2"));

			if (operacao.equalsIgnoreCase("soma")) {
				resp.getWriter().append(("<html><h1>" + v1 + "+" + v2 + "=" + (v1 + v2) + "</h1></html>"));
			} else if (operacao.equalsIgnoreCase("subtrair")) {
				resp.getWriter().append(("<html><h1>" + v1 + "-" + v2 + "=" + (v1 - v2) + "</h1></html>"));
			} else if (operacao.equalsIgnoreCase("multip")) {
				resp.getWriter().append(("<html><h1>" + v1 + "x" + v2 + "=" + (v1 * v2) + "</h1></html>"));
			} else if (operacao.equalsIgnoreCase("divi")) {
				resp.getWriter().append(("<html><h1>" + v1 + "/" + v2 + "=" + (v1 / v2) + "</h1></html>"));
			}
		} catch (Exception e) {
			resp.getWriter().append("<html><h1>ERRO: " + e + "</h1></html>");
		}
	}
}
