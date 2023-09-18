package coffees;

public class MilkDecorator implements GiraffeCoffee{

    private GiraffeCoffee giraffeCoffee;

    public MilkDecorator(GiraffeCoffee giraffeCoffee){
        this.giraffeCoffee = giraffeCoffee;
    }
    @Override
    public int costOfCoffee() {
        return giraffeCoffee.costOfCoffee()+70;
    }

    @Override
    public String nameofCoffee() {
        return giraffeCoffee.nameofCoffee() + " with milk";
    }
}
