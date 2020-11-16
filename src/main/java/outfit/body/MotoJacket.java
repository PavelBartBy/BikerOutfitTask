package outfit.body;

import models.PartOfTheBody;
import outfit.BikerOutfit;

public class MotoJacket extends BikerOutfit {

    private PartOfTheBody protectedBodyPart;


    public MotoJacket(String outfitName, int price, double weight, PartOfTheBody protectedBodyPart) {
        super(outfitName, price, weight);
        this.protectedBodyPart=protectedBodyPart;
    }

    public PartOfTheBody getProtectedBodyPart() {
        return protectedBodyPart;
    }

    @Override
    public String toString() {
        return "MotoJacket{" +
                "protectedBodyPart=" + protectedBodyPart +
                "} " + super.toString();
    }
}
