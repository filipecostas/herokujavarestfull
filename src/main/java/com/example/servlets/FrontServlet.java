package com.example.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontServlet extends HttpServlet {

	private static final long serialVersionUID = 366388279802249610L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //ServletOutputStream out = resp.getOutputStream();
        //out.write("Hello Heroku!".getBytes());
        //out.flush();
        //out.close();
        
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		rd.forward(req, resp);
    }
    
}
