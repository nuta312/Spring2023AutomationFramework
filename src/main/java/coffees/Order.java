package coffees;

public class Order {
    public static void main(String[] args) {

        GiraffeCoffee normalCoffee = new BaseCoffee();
        System.out.println(normalCoffee.nameofCoffee() + " cost "+ normalCoffee.costOfCoffee());

        GiraffeCoffee coffeeWithMilk = new MilkDecorator(new BaseCoffee());
        System.out.println(coffeeWithMilk.nameofCoffee()+ " cost "+ coffeeWithMilk.costOfCoffee());

        GiraffeCoffee chocolateCoffee = new ChocolateDecorator(new MilkDecorator(new BaseCoffee()));
        System.out.println(chocolateCoffee.nameofCoffee()+ " cost "+ chocolateCoffee.costOfCoffee());
    }
}
