package monprojet.todo.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.Todo;

@Controller
public class HomeController {

    @GetMapping("/accueil")
    public String showIndex(HttpSession x, Model model) {
        x.setAttribute("lsttodo", new ArrayList<Todo>());
        model.addAttribute("todo", new Todo());
        return "/pages/accueil";
    }

    @PostMapping("/accueil")
    public String infoDisplay(@ModelAttribute(name = "todo") Todo todo, HttpSession x) {

        ArrayList<Todo> lst = (ArrayList<Todo>) x.getAttribute("lsttodo");
        lst.add(todo);
        return "/pages/accueil";
    }

}
