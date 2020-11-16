package outfit.arms;

import models.PartOfTheBody;
import outfit.BikerOutfit;

public class MotoGloves extends BikerOutfit {

    private PartOfTheBody protectedBodyPart;

    public MotoGloves(String outfitName, int price, double weight, PartOfTheBody protectedBodyPart) {
        super(outfitName, price, weight);
        this.protectedBodyPart=protectedBodyPart;
    }

    public PartOfTheBody getProtectedBodyPart() {
        return protectedBodyPart;
    }

    @Override
    public String toString() {
        return "MotoGloves{" +
                "protectedBodyPart=" + protectedBodyPart +
                "} " + super.toString();
    }
}
