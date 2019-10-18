package nl.abnamro.demo.RecipeSystem.service;

import nl.abnamro.demo.RecipeSystem.model.Recipe;

import java.util.List;

public interface RecipeService {

    /**
     * delete a recipe
     * @param recipeId
     */
     void deleteRecipe(Long recipeId);
    /**
     * update existing recipe
     * @param recipe
     * @return recipe with generated id
     */
    void addOrUpdateRecipe(Recipe recipe);
    /**
     * GEt an existing recipe , given id
     * @param recipeId
     * @return recipe with generated id
     */
    Recipe getRecipe(Long recipeId);
    /**
     * Get all existing recipe
     * @return list of recipes
     */
    List<Recipe> getAllRecipes();
}
