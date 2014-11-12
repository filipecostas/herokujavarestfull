package com.example.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RootServlet extends HttpServlet {

	private static final long serialVersionUID = 5479565387080909538L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
		if (req.getRequestURI().equals("/")) {
			RequestDispatcher rd = req.getRequestDispatcher("/dp/");
			rd.forward(req, resp);
		} else {
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
		}
    }

}