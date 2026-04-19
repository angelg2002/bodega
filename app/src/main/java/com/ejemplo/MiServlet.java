package com.ejemplo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/inicio")
public class MiServlet extends HttpServlet {

    // El GET simplemente nos manda al archivo JSP para ver el formulario
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    // El POST recibe el dato y nos manda de vuelta al JSP con un mensaje
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String valor = req.getParameter("dato");
        
        // "Guardamos" el dato en el request para que el JSP lo pueda leer
        req.setAttribute("mensaje", valor);
        
        // Volvemos a mostrar el index.jsp pero ahora con el dato procesado
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}