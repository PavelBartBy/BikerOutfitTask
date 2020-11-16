package outfit.legs;

import models.PartOfTheBody;
import outfit.BikerOutfit;

public class MotoBoots extends BikerOutfit {

    private PartOfTheBody protectedBodyPart;

    public MotoBoots(String outfitName, int price, double weight, PartOfTheBody protectedBodyPart) {
        super(outfitName, price, weight);
        this.protectedBodyPart=protectedBodyPart;
    }

    public PartOfTheBody getProtectedBodyPart() {
        return protectedBodyPart;
    }

    @Override
    public String toString() {
        return "MotoBoots{" +
                "protectedBodyPart=" + protectedBodyPart +
                "} " + super.toString();
    }
}
