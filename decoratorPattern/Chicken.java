// Concrete Decorator
public class Chicken extends MealDecorator {
    public Chicken(Meal meal) { super(meal); }
    @Override
    public String getDescription() {
        return meal.getDescription() + ", Chicken";
    }
    @Override
    public double cost() {
        return meal.cost() + 50.0;
    }
}
