package outfit.body;

import models.PartOfTheBody;
import outfit.BikerOutfit;

public class BodyProtector extends BikerOutfit {

    private PartOfTheBody protectedBodyPart;

    public BodyProtector(String outfitName, int price, double weight, PartOfTheBody protectedBodyPart) {
        super(outfitName, price, weight);
        this.protectedBodyPart=protectedBodyPart;
    }

    public PartOfTheBody getProtectedBodyPart() {
        return protectedBodyPart;
    }

    @Override
    public String toString() {
        return "BodyProtector{" +
                "protectedBodyPart=" + protectedBodyPart +
                "} " + super.toString();
    }
}
