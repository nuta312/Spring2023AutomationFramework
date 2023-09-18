package coffees;

public class BaseCoffee implements GiraffeCoffee{
    @Override
    public int costOfCoffee() {
        return 190;
    }

    @Override
    public String nameofCoffee() {
        return "normal coffee";
    }
}
