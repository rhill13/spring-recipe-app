package biz.rookware.springrecipeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import biz.rookware.springrecipeapp.services.RecipeService;


@Controller
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    
    @GetMapping({"", "/", "/index", "/index.html"})
    public String getRecipes(Model model) {

        model.addAttribute("recipes", recipeService.listRecipes());

        return "recipes/index";
    }
    
}
