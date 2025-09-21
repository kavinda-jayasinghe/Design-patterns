// Concrete Component
public class Bread extends Meal {
    @Override
    public String getDescription() {
        return "Bread";
    }
    @Override
    public double cost() {
        return 80.0;
    }
}
