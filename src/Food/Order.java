package Food;

public class Order {
	private User user;
	private Food food;
	private String date;
	private static int count;
	
	public Order(User user, Food food, String date) {
		this.user = user;
		this.food = food;
		this.date = date;
		count++;
	}

	public String getDate() {
		return date;
	}
	public static int getCount() {
		return count;
	}

	public Food getFood() {
		return food;
	}

	public User getUser() {
		return user;
	}
	
	public void displayOrder() {
		System.out.println(user.getName() + " ordered " + food.getName() + " on " + date);
	}


	
	
	
}
