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
import java.util.ArrayList;
import java.util.List;

public class Biker {

    public List<BikerOutfit> listOfChosenOutfit = new ArrayList<>();

    public List<? extends BikerOutfit>  getOutfitForArms(List<? extends BikerOutfit> outfits){
        List<BikerOutfit> outfitForArms = new ArrayList<>();
        for (BikerOutfit i:outfits){
            if (i instanceof MotoGloves || i instanceof ElbowArmor){
                outfitForArms.add(i);
            }
        }
        return outfitForArms;
    }

    public List<? extends BikerOutfit>  getOutfitForBody(List<? extends BikerOutfit> outfits){
        List<BikerOutfit> outfitForBody = new ArrayList<>();
        for (BikerOutfit i:outfits){
            if (i instanceof MotoJacket || i instanceof BodyProtector){
                outfitForBody.add(i);
            }
        }
        return outfitForBody;
    }

    public List<? extends BikerOutfit>  getOutfitForHead(List<? extends BikerOutfit> outfits){
        List<BikerOutfit> outfitForHead = new ArrayList<>();
        for (BikerOutfit i:outfits){
            if (i instanceof MotoHelmet){
                outfitForHead.add(i);
            }
        }
        return outfitForHead;
    }

    public List<? extends BikerOutfit>  getOutfitForLegs(List<? extends BikerOutfit> outfits){
        List<BikerOutfit> outfitForLegs = new ArrayList<>();
        for (BikerOutfit i:outfits){
            if (i instanceof KneeArmor || i instanceof MotoPants || i instanceof MotoBoots){
                outfitForLegs.add(i);
            }
        }
        return outfitForLegs;
    }

    public void printList(List<? extends BikerOutfit> list){
        for (int i =0; i<list.size();i++){
            System.out.println(i+". "+ list.get(i));
        }
    }

    public void collectOutfit(List<? extends BikerOutfit> outfits) throws IOException {
        System.out.println("Please input number of section:");
        System.out.println("1. For arms | 2. For Body | 3. For Head | 4. For Legs");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List listOfOutfit= new ArrayList<>();
        String inputLine = reader.readLine();
        switch (inputLine){
            case "1": listOfOutfit = getOutfitForArms(outfits); break;
            case "2": listOfOutfit = getOutfitForBody(outfits); break;
            case "3": listOfOutfit = getOutfitForHead(outfits); break;
            case "4": listOfOutfit = getOutfitForLegs(outfits); break;
        }
        printList(listOfOutfit);
        System.out.println("Choose your outfit number");
        inputLine = reader.readLine();
        listOfChosenOutfit.add((BikerOutfit)listOfOutfit.get(Integer.parseInt(inputLine)));
        System.out.println("Continue? Y/N");
        inputLine = reader.readLine();
        if (inputLine.equals("Y")){
           collectOutfit(outfits);
        } else if(inputLine.equals("N")){
            printList(listOfChosenOutfit);
            System.out.println("Total price: ");
            System.out.println(calculateOutfitPrice(listOfChosenOutfit));
        } else {
            System.out.println("Wrong parameter. Going to exit");
            System.out.println("Total price: ");
            printList(listOfChosenOutfit);
            System.out.println(calculateOutfitPrice(listOfChosenOutfit));
        }
    }

    public int calculateOutfitPrice(List<BikerOutfit> listOfOutfit){
        int sumOfPrice = 0;
        for(BikerOutfit i:listOfOutfit){
            sumOfPrice+=i.getPrice();
        }
        return sumOfPrice;
    }

    public List<? extends BikerOutfit> sortByWeight(List<? extends BikerOutfit> outfits){

        for (int i=outfits.size()-1; i>=1; i--){
            for (int j=0; j<i; j++){
                if (outfits.get(j).getWeight()>outfits.get(j+1).getWeight()){
                    toSwap(outfits, j,j+1);
                }
            }
        }
        return outfits;
    }

    public static void toSwap (List list,int a, int b){

        BikerOutfit temp = (BikerOutfit) list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);

    }

    public void findOutfitByPriceRange(List<? extends BikerOutfit> outfit) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input min price:");
        int minPrice = Integer.parseInt(reader.readLine());
        System.out.println("Please input max price:");
        int maxPrice = Integer.parseInt(reader.readLine());
        printList(filterOutfitByPriceRange(outfit,minPrice,maxPrice));
    }

    public List<BikerOutfit> filterOutfitByPriceRange(List<? extends BikerOutfit> outfit, int minPrice, int maxPrice){
        List <BikerOutfit> filteredOutfitList = new ArrayList<>();
        for(BikerOutfit i:outfit){
            if(i.getPrice()>=minPrice && i.getPrice()<=maxPrice){
                filteredOutfitList.add(i);
            }
        }
        return filteredOutfitList;
    }
}
