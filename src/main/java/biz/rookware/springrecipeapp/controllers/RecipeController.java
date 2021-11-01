package biz.rookware.springrecipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/recipes")
public class RecipeController {
    
    @GetMapping({"", "/", "/index", "/index.html"})
    public String getRecipes() {
        return "recipes/index";
    }
    
}
