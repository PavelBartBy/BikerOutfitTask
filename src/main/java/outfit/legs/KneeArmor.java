package outfit.legs;

import models.PartOfTheBody;
import outfit.BikerOutfit;

public class KneeArmor extends BikerOutfit {

    private PartOfTheBody protectedBodyPart;

    public KneeArmor(String outfitName, int price, double weight, PartOfTheBody protectedBodyPart) {
        super(outfitName, price, weight);
        this.protectedBodyPart=protectedBodyPart;
    }

    public PartOfTheBody getProtectedBodyPart() {
        return protectedBodyPart;
    }

    @Override
    public String toString() {
        return "KneeArmor{" +
                "protectedBodyPart=" + protectedBodyPart +
                "} " + super.toString();
    }
}
