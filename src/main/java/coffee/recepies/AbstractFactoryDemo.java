package coffee.recepies;


public class AbstractFactoryDemo {

    public static void main(String[] args) throws Exception {

        Coffee coffee=new CoffeeMachine().makeCoffee();
        coffee.consume();

    }
}
