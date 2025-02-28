package Food;

import java.util.ArrayList;

public class Application {
	private ArrayList<Food> foods = new ArrayList<>();
	private ArrayList<Order> orders = new ArrayList<>();

	
	 public void addNewFood(Food food) {
	        foods.add(food);
	        System.out.println(food.getName() + " was successfully added to the kitchen!");
	    }

	 public void displayFoods() {
	        System.out.println("Food List:");
	        for (Food food : foods) {
	            System.out.println(food.getName() + " (" + food.getCalories() + " calories)");
	            System.out.println("Description: " + food.getDescription());
	            System.out.println("Spicy Level: " + food.getSpiceLevel());
	            food.displayIngredients();
	        }
	 }
	 
	 public void order(User user, Food food, String date) {
	        orders.add(new Order(user, food, date));
	 }
	    
	 public void displayOrders() {
	        System.out.println("Orders:");
	        for (Order order : orders) {
	            order.displayOrder();
	        }
	 }
	

}
