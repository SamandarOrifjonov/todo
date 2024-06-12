package uz.pdp.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uz.pdp.Repository.TodoRepository;
import uz.pdp.model.Todo;

import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TodoRepository todoRepository = new TodoRepository();
        List<Todo> all = todoRepository.getAll();
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }
}