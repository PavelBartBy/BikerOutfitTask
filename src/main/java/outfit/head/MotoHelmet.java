package outfit.head;

import models.PartOfTheBody;
import outfit.BikerOutfit;

public class MotoHelmet extends BikerOutfit {

    private PartOfTheBody protectedBodyPart;

    public MotoHelmet(String outfitName, int price,  double weight, PartOfTheBody protectedBodyPart) {
        super(outfitName, price, weight);
        this.protectedBodyPart=protectedBodyPart;
    }

    public PartOfTheBody getProtectedBodyPart() {
        return protectedBodyPart;
    }

    @Override
    public String toString() {
        return "MotoHelmet{" +
                "protectedBodyPart=" + protectedBodyPart +
                "} " + super.toString();
    }
}
