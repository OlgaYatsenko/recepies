package coffee.recepies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


import org.javatuples.Pair;
import org.reflections.Reflections;



public class CoffeeMachine {

    public enum AvailableCoffee
    {
        ESSPRESSO, LATTE
    }


    private List<Pair<String, CoffeeFactory>> namedFactories =
            new ArrayList<>();


    public CoffeeMachine() throws Exception
    {

        Set<Class<? extends CoffeeFactory>> types =
                new Reflections("coffee.recepies.") // ""
                        .getSubTypesOf(CoffeeFactory.class);
        for (Class<? extends CoffeeFactory> type : types)
        {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("FactoryImpl", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }
    }


    public Coffee makeCoffee() throws IOException {

        System.out.println(" Available coffee: ");
        for (int i=0; i<namedFactories.size(); i++){
            System.out.println(i+": "+namedFactories.get(i).getValue0());
        }



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < namedFactories.size())
            {
                System.out.println("Specify amount: ");
                s = reader.readLine();
                if (s != null
                        && (amount = Integer.parseInt(s)) > 0)
                {
                    return namedFactories.get(i).getValue1().prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
        }

}


