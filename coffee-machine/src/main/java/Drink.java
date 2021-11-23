import java.util.Objects;

public abstract class Drink {
    Integer sugar;
    Boolean stick;

    public Drink(Integer sugar, Boolean stick){
        this.sugar = sugar;
        this.stick = stick;
    }
    public abstract double getPrice();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drink)) return false;
        Drink drink = (Drink) o;
        return Objects.equals(sugar, drink.sugar) && Objects.equals(stick, drink.stick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sugar, stick);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "sugar=" + sugar +
                ", stick=" + stick +
                '}';
    }
}
