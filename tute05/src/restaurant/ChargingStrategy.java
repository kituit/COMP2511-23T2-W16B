package restaurant;

public interface ChargingStrategy {
    
    public double getModifier();

    public double calculatePrice(Meal meal, Boolean isMember);

}
