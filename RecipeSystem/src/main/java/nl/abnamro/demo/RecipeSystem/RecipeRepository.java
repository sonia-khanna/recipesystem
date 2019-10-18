package nl.abnamro.demo.RecipeSystem;


import nl.abnamro.demo.RecipeSystem.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
