package ingredient;

public class Ingredient {
    private String type;
    private double amount;
    private String unit;
    private double kcal;
    private double weightPrUnit;
    private int amountOfPeople;
    private double kJoule;



    public Ingredient(String type, double amount, String unit, double kcal, double weightPrUnit, double kJoule) {
        this.type = type;
        this.amount = amount;
        this.unit = unit;
        this.kcal = kcal;
        this.weightPrUnit = weightPrUnit;
        this.amountOfPeople = 1; //jeg defaulter amountOfPeople til en person
        this.kJoule = kJoule;
    }

    //settere
    public void setAmountOfPeople(int amountOfPeople){
        if (amountOfPeople > 0) {
            this.amountOfPeople = amountOfPeople;
        }
    }

    //getter metoder
    public double getKJoule() {
        return kJoule * amountOfPeople;
    }


    public double getKcal() {
        return kcal * amountOfPeople;
    }

    public double getWeightPrUnit() {
        return weightPrUnit * amountOfPeople;
    }


    public String toString() {
        double adjustedAmount = amount * amountOfPeople;
        double adjustedKcal = kcal * amountOfPeople;
        double adjustedWeight = weightPrUnit * amountOfPeople;

        return "\u2503" + adjustedAmount + " " + unit + " " + type + ", hvilket vejer " + adjustedWeight + " gram, som er " + adjustedKcal + " kalorier" + "\n"
                + "\u2503\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2501\u2503";
    }


}
