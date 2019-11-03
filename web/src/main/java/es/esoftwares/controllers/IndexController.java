package es.esoftwares.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("/")
    //@ResponseBody
    public String getIndexPage(Model model){

        return "index";
    }
}
