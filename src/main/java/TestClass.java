public class TestClass {
    public static void main(String[] args) {
        ChocolateFactory chocolateFactory = new ChocolateFactory();
        Chocolate chocolate = chocolateFactory.sellChocolate("milk chocolate");
        Chocolate chocolate1 = chocolateFactory.sellChocolate("dark chocolate");
        Chocolate chocolate2 = chocolateFactory.sellChocolate("plazma chocolate");
        Chocolate chocolate3 = chocolateFactory.sellChocolate("white chocolate");
        chocolate.packChocolate();
        chocolate1.packChocolate();
        chocolate2.packChocolate();
        chocolate3.packChocolate();
    }
}
