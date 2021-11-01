package biz.rookware.springrecipeapp.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import biz.rookware.springrecipeapp.models.Recipe;

@Service
@Primary
public class TestRecipesServiceImpl implements RecipeService {

    Set<Recipe> recipes = new HashSet<>();
    Set<String> ingredients = new HashSet<>();
    Set<String> instructions = new HashSet<>();


    @Override
    public Set<Recipe> listRecipes() {
        ingredients.add("eggs");
        ingredients.add("milk");

        instructions.add("crack eggs");
        instructions.add("beat eggs");
        instructions.add("cook in pan");

        Recipe recipe = new Recipe("Scrambled Eggs", ingredients, instructions, "Ryan Hill");
        recipes.add(recipe);
        return recipes;
    }
    
}
