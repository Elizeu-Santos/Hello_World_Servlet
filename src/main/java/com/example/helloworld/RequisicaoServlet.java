package com.example.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/requisicao")
public class RequisicaoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // recupera as informações da requisição
        String metodo = request.getMethod();
        String uri = request.getRequestURI();
        String protocolo = request.getProtocol();
        String enderecoRemoto = request.getRemoteAddr();

        // exibe as informações na tela
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Informacao da Requisicao</title>");
        out.println("<style>");
        out.println("body {");
        out.println("background-color: #222;");
        out.println("color: #fff;");
        out.println("font-family: Arial, sans-serif;");
        out.println("display: flex;");
        out.println("flex-direction: column;");
        out.println("justify-content: center;");
        out.println("align-items: center;");
        out.println("}");
        out.println("h1 {");
        out.println("text-align: center;");
        out.println("}");
        out.println("p {");
        out.println("margin: 10px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Informacao da Requisicao</h1>");
        out.println("<p>Metodo: " + metodo + "</p>");
        out.println("<p>URI: " + uri + "</p>");
        out.println("<p>Protocolo: " + protocolo + "</p>");
        out.println("<p>Endereco Remoto: " + enderecoRemoto + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
