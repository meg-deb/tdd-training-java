public class Coffee extends Drink{
    public Coffee(Integer sugar, Boolean stick) {
        super(sugar, stick);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
