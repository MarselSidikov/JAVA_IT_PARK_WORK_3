package ru.itpark.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UsersServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // берем штуку, в которую можно "вписать ответ"
    PrintWriter writer = resp.getWriter();
    writer.write("<h1>Hello!</h1>");
  }
}
