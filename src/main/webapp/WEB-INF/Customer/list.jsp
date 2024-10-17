<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.empresariales.model.Customer" %> <!-- Reemplaza 'tu.paquete' con el paquete real donde se encuentra la clase Customer -->

<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
  <table class="table">
      <thead>
          <tr>
              <th>ID</th>
              <th>Company</th>
              <th>Contact</th>
              <th>Title</th>
              <th>Address</th>
          </tr>
      </thead>
      <tbody>
      <%
      List<Customer> customers = (ArrayList<Customer>request.getAttribute("customers"))
      for(Customer customer: customers){
      %>
          <tr>
              <td><%= customer.getCustId()%></td>
              <td><%= customer.getCompanyName()%></td>
              <td><%= customer.getContactName()%></td>
              <td><%= customer.getContactTitle()%></td>
              <td><%= customer.getAddress()%></td>
          </tr>

          <%
          }
          %>

      </tbody>
  </table>
    <h1>Hello, world!</h1>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>