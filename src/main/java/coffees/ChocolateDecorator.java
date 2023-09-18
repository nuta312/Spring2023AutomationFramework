package coffees;

public class ChocolateDecorator implements GiraffeCoffee{

    private GiraffeCoffee giraffeCoffee;
    public ChocolateDecorator (GiraffeCoffee giraffeCoffee){
        this.giraffeCoffee=giraffeCoffee;
    }
    @Override
    public int costOfCoffee() {
        return giraffeCoffee.costOfCoffee()+50;
    }

    @Override
    public String nameofCoffee() {
        return giraffeCoffee.nameofCoffee()+" with chocolate";
    }
}
