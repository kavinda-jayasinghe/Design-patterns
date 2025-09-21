// Concrete Component
public class Noodles extends Meal {
    @Override
    public String getDescription() {
        return "Noodles";
    }
    @Override
    public double cost() {
        return 90.0;
    }
}
