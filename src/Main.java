//package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffe machinne has:");
        int hasWater = scan.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int hasMilk = scan.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int hasBeans = scan.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsQtyNeed = scan.nextInt();
        int waterQtyNeed = cupsQtyNeed * 200;
        int milkQtyNeed = cupsQtyNeed *50;
        int beansQtyNeed = cupsQtyNeed * 15;
        int capsCalc =
        int waterCalc = hasWater / waterQtyNeed;
        int milkCalc = hasMilk / milkQtyNeed;
        int beansCalc = hasBeans / beansQtyNeed
        //System.out.println("For " + cupsQty + " cups of coffee you will need:");
        //System.out.println(waterQty + " ml of water");
        //System.out.println(milkQty + " ml of milk");
        //System.out.println(beansQty + " g of coffee beans");
        //System.out.println("Starting to make a coffee");
        //System.out.println("Grinding coffee beans");
        //System.out.println("Boiling water");
        //System.out.println("Mixing boiled water with crushed coffee beans");
        //System.out.println("Pouring coffee into the cup");
        //System.out.println("Pouring some milk into the cup");
        //System.out.println("Coffee is ready!");
    }
}
