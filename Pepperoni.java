public class Pepperoni extends PizzaDecorator
{
    public Pepperoni(PizzaInt decoratedPizza)
    {
        super(decoratedPizza);
    }
    public void makePizza()
    {
        decoratedPizza.makePizza();
        System.out.println("Add Pepperoni");
    }

}
