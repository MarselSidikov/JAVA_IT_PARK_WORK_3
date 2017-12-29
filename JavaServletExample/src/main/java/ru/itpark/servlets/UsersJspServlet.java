package ru.itpark.servlets;

import ru.itpark.repository.UsersRepository;
import ru.itpark.repository.UsersRepositoryEntityManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UsersJspServlet extends HttpServlet {

    private UsersRepository usersRepository;

    @Override
    public void init() throws ServletException {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("ru.itpark.persistence");

        this.usersRepository = new UsersRepositoryEntityManagerImpl(factory.createEntityManager());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("hello", "Привет, Марсель!");

        req.setAttribute("users", usersRepository.findAll());
        req.getRequestDispatcher("/jsp/users_with_tags.jsp").forward(req, resp);
    }
}
