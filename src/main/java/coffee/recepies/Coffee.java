package coffee.recepies;

public interface Coffee {

    void consume();
}


class Esspresso implements Coffee{
    public void consume(){
        System.out.println("Enjoy your strong Espresso");
    }
}

class Latte implements  Coffee{
    public void consume(){
        System.out.println("Enjoy your Americano");
    }
}

