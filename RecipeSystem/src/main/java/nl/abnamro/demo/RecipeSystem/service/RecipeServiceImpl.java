package nl.abnamro.demo.RecipeSystem.service;

import nl.abnamro.demo.RecipeSystem.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import nl.abnamro.demo.RecipeSystem.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RecipeServiceImpl implements RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    /**
     * delete a recipe
     * @param recipeId
     */
    @Override
    public void deleteRecipe(Long recipeId){
        recipeRepository.deleteById(recipeId);
    }
    /**
     * update existing recipe
     * @param recipe
     * @return recipe with generated id
     */
    @Override
    public void addOrUpdateRecipe(Recipe recipe){
        recipeRepository.save(recipe);
    }
    /**
     * GEt an existing recipe , given name
     * @param recipeId
     * @return recipe with generated id
     */
    @Override
    public Recipe getRecipe(Long recipeId){
        return recipeRepository.findById(recipeId).get();
    }
    /**
     * Get all existing recipe
     * @return list of recipes
     */
    @Override
    public List<Recipe> getAllRecipes(){
        List<Recipe> recipes= new ArrayList<Recipe>();
         recipeRepository.findAll().forEach(recipe -> recipes.add(recipe));
         return recipes;
    }
}
