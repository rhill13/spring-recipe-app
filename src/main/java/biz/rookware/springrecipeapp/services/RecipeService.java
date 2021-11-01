package biz.rookware.springrecipeapp.services;

import java.util.Set;

import biz.rookware.springrecipeapp.models.Recipe;

public interface RecipeService {
    
    public Set<Recipe> listRecipes();

}
