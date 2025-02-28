package Food;

import java.util.ArrayList;

public class Food {
	private String name;
	private String description;
	private int spiceLevel;
	private int calories;
	private ArrayList<Ingredient> ingredients = new ArrayList<>();

	public Food(String name, String description, int spiceLevel, int calories) {
		this.name = name;
		this.description = description;
		this.spiceLevel = spiceLevel;
		this.calories = calories;
	}
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getSpiceLevel() {
		return spiceLevel;
	}
	public int getCalories() {
		return calories;
	}
	
	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
		
	}
	
	public String toString() {
        return name + " (" + calories + " calories)" + "\n" + "Description: " + description + "\n" + "Spicy Level: " + spiceLevel + "\n" + "Ingredients: ";
    }
    
    public void displayIngredients() {
        System.out.println("Ingredients of " + name + ":");
        for (Ingredient ingredient : ingredients) {
            System.out.print(ingredient.getName() + ",");
        }
    }
	
	
	

	

}
