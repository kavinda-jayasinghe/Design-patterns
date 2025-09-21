// Concrete Decorator
public class Egg extends MealDecorator {
    public Egg(Meal meal) { super(meal); }
    @Override
    public String getDescription() {
        return meal.getDescription() + ", Egg";
    }
    @Override
    public double cost() {
        return meal.cost() + 30.0;
    }
}
