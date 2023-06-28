package restaurant;

public class StandardStrategy implements ChargingStrategy {

    @Override
    public double getModifier() {
        return 1;
    }

    @Override
    public double calculatePrice(Meal meal, Boolean isMember) {
        return meal.getCost();
    }
    
}
