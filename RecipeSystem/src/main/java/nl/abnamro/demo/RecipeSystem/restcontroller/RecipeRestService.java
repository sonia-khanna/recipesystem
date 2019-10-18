package nl.abnamro.demo.RecipeSystem.restcontroller;

import nl.abnamro.demo.RecipeSystem.model.Recipe;
import nl.abnamro.demo.RecipeSystem.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/")
public class RecipeRestService {
    @Autowired
    RecipeService recipeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Recipe>> getAllRecipe() {
        List<Recipe> recipeList = recipeService.getAllRecipes();
        if (recipeList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            return ResponseEntity.ok(recipeService.getAllRecipes());
        }
    }


    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Recipe> getRecipeById(@PathVariable("id") Long id) {
        try {
            Recipe recipe = recipeService.getRecipe(id);

            if (recipe == null) {
                return new ResponseEntity(HttpStatus.NO_CONTENT);
            } else {
                return ResponseEntity.ok(recipe);
            }
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable("id") Long id) {
        recipeService.deleteRecipe(id);
        return ResponseEntity.noContent().build();
    }


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> createRecipe(@Valid @RequestBody Recipe recipe) {

        recipeService.addOrUpdateRecipe(recipe);
        Long id  = recipe.getRecipeId();
        ResponseEntity.status(HttpStatus.CREATED);
        return ResponseEntity.ok(id);
    }


    @PutMapping(value = "{id}", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Recipe> updateRecipe(@PathVariable("id") Long id,
                                               @Valid @RequestBody Recipe recipe) {
        try {
            if (recipeService.getRecipe(id) == null) {
                return new ResponseEntity(HttpStatus.CONFLICT);
            } else {
                recipe.setRecipeId(id);
               recipeService.addOrUpdateRecipe(recipe);
            }
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(recipe);
    }

}