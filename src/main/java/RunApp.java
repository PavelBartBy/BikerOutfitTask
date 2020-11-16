import models.PartOfTheBody;
import outfit.BikerOutfit;
import outfit.arms.ElbowArmor;
import outfit.arms.MotoGloves;
import outfit.body.BodyProtector;
import outfit.body.MotoJacket;
import outfit.head.MotoHelmet;
import outfit.legs.KneeArmor;
import outfit.legs.MotoBoots;
import outfit.legs.MotoPants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class RunApp {

    static List<? extends BikerOutfit> outfit = Arrays.asList(
            new MotoHelmet("Scorpion EXO-R420", 150, 1.5, PartOfTheBody.HEAD),
            new MotoHelmet("AGV K1", 210, 1.6, PartOfTheBody.HEAD),
            new MotoHelmet("Icon Airflite Stim", 290, 1.2, PartOfTheBody.HEAD),
            new MotoJacket("Alpinestar T-GP", 204, 1.8,PartOfTheBody.BODY),
            new MotoJacket("Joe Rocket Atomic", 180, 2.1, PartOfTheBody.BODY),
            new MotoJacket("Bilt Alder Leather", 200, 2.2,PartOfTheBody.BODY),
            new MotoGloves("Dainese Blackjack", 90, 0.3, PartOfTheBody.ARMS),
            new MotoGloves("Scorpion SGC", 85, 0.3,PartOfTheBody.ARMS),
            new MotoGloves("BILT Sprinter", 26, 0.3, PartOfTheBody.ARMS),
            new MotoPants("Klim K Fifty", 300, 1.3, PartOfTheBody.LEGS),
            new MotoPants("REVIT Sand", 288, 1.4, PartOfTheBody.LEGS),
            new MotoPants("Aplpinestar Andes", 230, 1.2, PartOfTheBody.LEGS),
            new MotoBoots("TSX Blaze Boots", 70, 0.8, PartOfTheBody.FOOT),
            new MotoBoots("Street&Steel Kickstarter", 100, 0.4, PartOfTheBody.FOOT),
            new MotoBoots("Alpinestar Sektor", 140, 0.4, PartOfTheBody.FOOT),
            new KneeArmor("Leatt Dual Axis", 100, 0.7,PartOfTheBody.LEGS),
            new BodyProtector("Alpinestar Bionic Action", 160, 1.6, PartOfTheBody.BODY),
            new KneeArmor("Deinese V E1", 70, 0.8, PartOfTheBody.LEGS),
            new BodyProtector("Leatt 5.5", 290, 1.9, PartOfTheBody.BODY),
            new ElbowArmor("Scorpion SAS-TECH",35, 0.3, PartOfTheBody.ARMS),
            new ElbowArmor("Leatt 3DF6.0",85,0.4,PartOfTheBody.ARMS)
    );


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello! Welcome to our app. Choose your action(pls input number):");
        System.out.println("Biker's outfit->1 | Finq outfit by price->2 | Sort equip by weight->3");
        Biker biker = new Biker();
        String inputLine = reader.readLine();
        switch (inputLine){
            case"1":
                biker.collectOutfit((outfit));
                break;
            case"2":
                biker.findOutfitByPriceRange(outfit);
                break;
            case"3":
                biker.sortByWeight(outfit);
                biker.printList(outfit);
                break;
        }
    }


}
