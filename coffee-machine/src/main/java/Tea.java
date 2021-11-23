public class Tea extends Drink{
    private static final double PRICE = 0.4;

    public Tea(Integer sugar, Boolean stick) {
        super(sugar, stick);
    }

    public double getPrice() {
        return PRICE;
    }
}
