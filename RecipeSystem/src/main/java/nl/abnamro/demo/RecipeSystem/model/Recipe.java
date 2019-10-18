package nl.abnamro.demo.RecipeSystem.model;



import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




@Entity
@Table(name = "recipesys")
public class Recipe implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id()
    @GeneratedValue
    @Column(name = "recipe_id", updatable = false, nullable = false)
    private Long recipeId;

    @NotNull
    @Column(name = "recipe_name")
    private String recipeName;

    @NotNull
    @Column(name = "creation_date")
    private String creationDate;

    @NotNull
    @Column(name = "is_veg")
    private String isVeg;

    @NotNull
    @Column(name = "no_of_person")
    private String numberOfPeople;

    @NotNull
    @Column(name = "ingredients")
    private String ingredients;

    @NotNull
    @Column(name = "instructions")
    private String instructions;


    public Recipe() {
        super();
    }

    public Recipe(Long recipeId, @NotNull String recipeName, @NotNull String creationDate, @NotNull String isVeg, @NotNull String numberOfPeople, @NotNull String ingredients, @NotNull String instructions) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.creationDate = creationDate;
        this.isVeg = isVeg;
        this.numberOfPeople = numberOfPeople;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getIsVeg() {
        return isVeg;
    }

    public void setIsVeg(String isVeg) {
        this.isVeg = isVeg;
    }

    public String getNumberOfPeople() {
        return numberOfPeople;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public void setNumberOfPeople(String numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", recipeName='" + recipeName + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", isVeg='" + isVeg + '\'' +
                ", numberOfPeople='" + numberOfPeople + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }


}

