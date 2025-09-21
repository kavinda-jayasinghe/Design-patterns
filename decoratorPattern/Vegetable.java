// Concrete Decorator
public class Vegetable extends MealDecorator {
    public Vegetable(Meal meal) { super(meal); }
    @Override
    public String getDescription() {
        return meal.getDescription() + ", Vegetable";
    }
    @Override
    public double cost() {
        return meal.cost() + 20.0;
    }
}
