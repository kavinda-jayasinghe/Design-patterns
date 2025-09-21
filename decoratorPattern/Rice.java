// Concrete Component
public class Rice extends Meal {
    @Override
    public String getDescription() {
        return "Rice";
    }
    @Override
    public double cost() {
        return 100.0;
    }
}
