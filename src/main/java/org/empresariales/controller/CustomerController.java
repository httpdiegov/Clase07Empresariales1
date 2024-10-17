package org.empresariales.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.empresariales.ejb.CustomerService;
import org.empresariales.util.DbConnection;

import java.io.IOException;
import java.sql.Connection;

@WebServlet("/Customer")
public class CustomerController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        try {
            Connection con = DbConnection.getInstance().getConexion();
            if(con != null){
                req.setAttribute("mensaje", "Conexión establecida");
                req.setAttribute("customers", CustomerService.getCustomers());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        req.getRequestDispatcher("/WEB-INF/Customer/list.jsp").forward(req,resp);
    }
}