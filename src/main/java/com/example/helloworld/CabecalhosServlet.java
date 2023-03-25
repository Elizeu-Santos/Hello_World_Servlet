package com.example.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cabecalhos")
public class CabecalhosServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cabeçalhos HTTP</title>");
        out.println("<style>");
        out.println("body {");
        out.println("background: #333;");
        out.println("color: #fff;");
        out.println("display: flex;");
        out.println("flex-direction: column;");
        out.println("justify-content: center;");
        out.println("align-items: center;");
        out.println("height: 100vh;");
        out.println("}");
        out.println("h1, h2 {");
        out.println("color: #fff;");
        out.println("text-align: center;");
        out.println("}");
        out.println("p {");
        out.println("color: #ccc;");
        out.println("text-align: center;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Cabeçalhos HTTP</h1>");

        out.println("<h2>Host</h2>");
        out.println("<p>" + request.getHeader("Host") + "</p>");

        out.println("<h2>User-Agent</h2>");
        out.println("<p>" + request.getHeader("User-Agent") + "</p>");

        out.println("<h2>Accept-Encoding</h2>");
        out.println("<p>" + request.getHeader("Accept-Encoding") + "</p>");

        out.println("<h2>Accept-Language</h2>");
        Enumeration<String> acceptLanguages = request.getHeaders("Accept-Language");
        while (acceptLanguages.hasMoreElements()) {
            out.println("<p>" + acceptLanguages.nextElement() + "</p>");
        }

        out.println("</body></html>");
    }
}
