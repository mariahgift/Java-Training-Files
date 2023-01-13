package design_patterns.ItalianResto;

public class PastaKitchen {
    Carbonara cab = new Carbonara();
    Spaghetti spag = new Spaghetti();
    Alfredo alf = new Alfredo();
    String dishName;
    public Pasta cook(String dish) {
        if (dish.equals("Carbonara")) {
            return cab;
        } else if (dish.equals("Spaghetti")) {
            return spag;
        } else if (dish.equals("Alfredo")) {
            return alf;
        } else {
            return null;
        }
    }


    //Singleton Pattern
    private static PastaKitchen instance;
    private PastaKitchen() {

    }

    public static synchronized PastaKitchen getInstance() {
        if (instance == null) {
            instance = new PastaKitchen();
        }
        return instance;
    }
}
