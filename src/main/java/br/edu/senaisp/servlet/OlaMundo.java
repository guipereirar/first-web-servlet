package br.edu.senaisp.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/olamundo")
public class OlaMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String somOuSub = req.getParameter("p1");
		int v1 = Integer.parseInt(req.getParameter("p2"));
		int v2 = Integer.parseInt(req.getParameter("p3"));
		
		if(somOuSub.equals("soma")) {
			resp.getWriter().append(("<html><h1>"+v1+"+"+v2+"="+(v1 + v2)+"</h1></html>"));
		}if (somOuSub.equals("subtracao")) {
			resp.getWriter().append(("<html><h1>"+v1+"+"+v2+"="+"</h1></html>"));
	}
	
	}
}
