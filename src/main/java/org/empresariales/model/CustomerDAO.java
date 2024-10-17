package org.empresariales.model;

import org.empresariales.util.DbConnection;

import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

    public static List<Customer> getCustomer() {

        List<Customer> customers = new ArrayList<>();
        try {
            Connection con = DbConnection.getInstance().getConexion();

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM Customer");

            while (rs.next()){
                Customer customer = new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
            customers.add(customer);
            }

            stmt.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return customers;
    }

}
