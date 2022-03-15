package com.codingodjo.counter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(HttpSession session) {
        if (session.getAttribute("counter") == null) {
            session.setAttribute("counter", 0);
        }else {
            session.setAttribute("counter", (int) session.getAttribute("counter") + 1);
        }
        return "index.jsp";
    }

    @RequestMapping("/reset")
    public String reset(HttpSession session) {
        session.setAttribute("counter", 0);
        return "redirect:/";
    }

    @RequestMapping("/incrementbytwo")
    public String incrementByTwo(HttpSession session) {
        if (session.getAttribute("counter") == null) {
            session.setAttribute("counter", 0);
        }else {
            session.setAttribute("counter", (int) session.getAttribute("counter") + 1);
        }
        return "redirect:/counter";
    }

    @RequestMapping("/counter")
    public String counter(HttpSession session, Model model) {
        Integer currentCount = (Integer) session.getAttribute("counter");
        model.addAttribute("countToShow", currentCount);
        return "counter.jsp";
    }
}


