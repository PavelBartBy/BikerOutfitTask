package outfit.legs;

import models.PartOfTheBody;
import outfit.BikerOutfit;

public class MotoPants extends BikerOutfit {

    private PartOfTheBody protectedBodyPart;

    public MotoPants(String outfitName, int price, double weight, PartOfTheBody protectedBodyPart) {
        super(outfitName, price, weight);
        this.protectedBodyPart=protectedBodyPart;
    }

    public PartOfTheBody getProtectedBodyPart() {
        return protectedBodyPart;
    }

    @Override
    public String toString() {
        return "MotoPants{" +
                "protectedBodyPart=" + protectedBodyPart +
                "} " + super.toString();
    }
}
