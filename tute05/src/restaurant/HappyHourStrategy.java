package restaurant;

public class HappyHourStrategy implements ChargingStrategy {

    @Override
    public double getModifier() {
        return 0.7;
    }

    @Override
    public double calculatePrice(Meal meal, Boolean isMember) {
        if (isMember) {
            return 0.6 * meal.getCost();
        } else {
            return 0.7 * meal.getCost();
        }
    }
    
}
