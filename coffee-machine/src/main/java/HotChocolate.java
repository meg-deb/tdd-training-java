public class HotChocolate extends Drink{
    public HotChocolate(Integer sugar, Boolean stick) {
        super(sugar, stick);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
