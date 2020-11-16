package outfit.arms;

import models.PartOfTheBody;
import outfit.BikerOutfit;

public class ElbowArmor extends BikerOutfit {

    private PartOfTheBody protectedBodyPart;

    public ElbowArmor(String outfitName, int price, double weight, PartOfTheBody protectedBodyPart) {
        super(outfitName, price, weight);
        this.protectedBodyPart=protectedBodyPart;
    }

    public PartOfTheBody getProtectedBodyPart() {
        return protectedBodyPart;
    }

    @Override
    public String toString() {
        return "ElbowArmor{" +
                "protectedBodyPart=" + protectedBodyPart +
                "} " + super.toString();
    }
}
