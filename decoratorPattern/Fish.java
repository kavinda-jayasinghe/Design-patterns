// Concrete Decorator
public class Fish extends MealDecorator {
    public Fish(Meal meal) { super(meal); }
    @Override
    public String getDescription() {
        return meal.getDescription() + ", Fish";
    }
    @Override
    public double cost() {
        return meal.cost() + 40.0;
    }
}
