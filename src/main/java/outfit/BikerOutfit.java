package outfit;

import java.io.Serializable;
import java.util.Objects;

public class BikerOutfit implements Serializable {

    String outfitName;
    int price;
    double weight;

    public BikerOutfit(String outfitName, int price, double weight) {
        this.outfitName=outfitName;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BikerOutfit that = (BikerOutfit) o;
        return price == that.price &&
                weight == that.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight);
    }

    @Override
    public String toString() {
        return "BikerOutfit{" +
                "outfitName='" + outfitName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
