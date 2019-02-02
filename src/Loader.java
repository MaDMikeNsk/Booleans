
public class Loader
{
    public static void main(String[] args)
    {

        Integer milkAmount = 200; // ml
        Integer powderAmount = 800; // g
        Integer eggsCount = 10; // pcs
        Integer sugarAmount = 100; // g
        Integer oilAmount = 300; // ml
        Integer appleCount = 10; //pcs

        boolean nothingToCook = true;

        if (powderAmount>=400 && sugarAmount>=10 && milkAmount>=110 && oilAmount>=30) {
            System.out.println("Pancakes");
            nothingToCook = false;
        }
        if (milkAmount>=300 && powderAmount>=5 && eggsCount>=5) {
            System.out.println("Omlette");
            nothingToCook = false;
        }
        if (appleCount>=3 && milkAmount>=100 && powderAmount>=300 && eggsCount>=4) {
            System.out.println("Apple pie");
            nothingToCook = false;
        }
        if (nothingToCook) System.out.println("Нужно больше продуктов :)");
    }
}