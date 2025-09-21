// Decorator base class
public abstract class MealDecorator extends Meal {
    protected final Meal meal;
    protected MealDecorator(Meal meal) {
        this.meal = meal;
    }
}
