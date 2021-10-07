package coffee.recepies;

public class LatteFactoryImpl implements CoffeeFactory {
    @Override
    public Coffee prepare(int cups) {
        String result="Put a coffee capsule into the machine, press the button and wait until the cup is filled in with the coffee. Pour some milk." +
                " Repeat "+ cups+ " times for each cup";

        System.out.println(result);

        return new Latte();
    }
}
