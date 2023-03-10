public class ChocolateFactory {
    public Chocolate sellChocolate(String type){
        switch (type) {
            case "dark chocolate":
                return new DarkChocolate();
            case "milk chocolate":
                return new MilkChocolate();
            case "plazma chocolate":
                return new PlazmaChocolate();
            case "white chocolate":
                return new WhiteChocolate();
        }
        return null;
    }
}
