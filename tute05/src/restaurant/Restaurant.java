package restaurant;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class Restaurant {

    private ChargingStrategy chargingStrategy = new StandardStrategy();
    private String name;
    private List<Meal> menu = new ArrayList<Meal>();
    private List<String> members = new ArrayList<String>();
    
    public Restaurant(String name) {
        this.name = name;
        JSONArray menuJSON = JSONHelper.readInData("src/restaurant/prices.json");

        for (Object Meal : menuJSON) {
            JSONObject jsonMeal = (JSONObject) Meal;
            menu.add(new Meal(jsonMeal.getString("meal"), jsonMeal.getInt("cost")));
        }
    }

    public void foo() {
        setStrategy(new StandardStrategy());
    }

    public void setStrategy(ChargingStrategy newStrategy) {
        this.chargingStrategy = newStrategy;
    }

    public double cost(List<Meal> order, String payee) {
        Boolean isMember = members.contains(payee);
        double totalPrice = 0;
        for (Meal meal : order) {
            totalPrice += chargingStrategy.calculatePrice(meal, isMember);
        }
        return totalPrice;
        // return order.stream().map(meal -> chargingStrategy.calculatePrice(meal, isMember)).sum();
    }

    public void displayMenu() {
        double modifier = chargingStrategy.getModifier();
        
        for (Meal meal : menu) {
            System.out.println(meal.getName() + " - " + meal.getCost() * modifier);
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant("XS");
        r.displayMenu();
    }

}