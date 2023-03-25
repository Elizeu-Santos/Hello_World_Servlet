package com.example.helloworld;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello Servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
        out.println("<title>Hello Servlet</title>");
        out.println("<style>");
        out.println("body {");
        out.println("  font-family: Arial, sans-serif;");
        out.println("  background: #222;");
        out.println("  color: #eee;");
        out.println("}");
        out.println(".container {");
        out.println("  display: flex;");
        out.println("  flex-direction: column;");
        out.println("  justify-content: center;");
        out.println("  align-items: center;");
        out.println("  height: 100vh;");
        out.println("}");
        out.println("h1 {");
        out.println("  color: #fff;");
        out.println("  text-align: center;");
        out.println("  margin-top: 50px;");
        out.println("}");
        out.println("ul {");
        out.println("  list-style-type: none;");
        out.println("  margin: 20px 0 0;");
        out.println("  padding: 0;");
        out.println("  display: block;");
        out.println("}");
        out.println("li {");
        out.println("  margin-bottom: 10px;");
        out.println("}");
        out.println("a {");
        out.println("  display: inline-block;");
        out.println("  background-image: linear-gradient(to bottom right, #ffffff, #eeeeee);");
        out.println("  border-radius: 10px;");
        out.println("  color: #222;");
        out.println("  font-weight: bold;");
        out.println("  padding: 10px 20px;");
        out.println("  text-decoration: none;");
        out.println("}");
        out.println("a:hover {");
        out.println("  background-image: linear-gradient(to bottom right, #ffffff, #eeeeee);");
        out.println("  text-decoration: underline;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='container'>");
        out.println("<h1>" + message + "</h1>");

        out.println("<ul>");
        out.println("<li><a href='requisicao'>/requisicao</a></li>");
        out.println("<li><a href='cabecalhos'>/cabecalhos</a></li>");
        out.println("</ul>");
        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }

    public void destroy() {
    }
}
