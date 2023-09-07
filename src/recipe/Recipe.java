package recipe;

import ingredient.Ingredient;

public class Recipe {
    private Ingredient[] ingredientArray;
    private int userPeople;

    public Recipe(int userPeople) {
        this.userPeople = userPeople;

        ingredientArray = new Ingredient[6];

        ingredientArray[0] = new Ingredient("æg", 1, "stk", 54, 49.6, 243);
        ingredientArray[1] = new Ingredient("mel", 100, "gram", 340, 100, 1428);
        ingredientArray[2] = new Ingredient("chokolade", 25, "gram", 126, 25,  529.2);
        ingredientArray[3] = new Ingredient("vand", 30, "ml", 0, 30, 0);
        ingredientArray[4] = new Ingredient("sukker", 25, "gram", 97, 25, 407.4);
        ingredientArray[5] = new Ingredient("bagepulver", 10, "gram", 0, 10, 0);



        //ny amountOfPeople
        amountOfPeople();

    }
    //for each loop som bruges til at opdatere hvert ingrediens
    private void amountOfPeople() {
        for (Ingredient ingrediens : ingredientArray) {
            ingrediens.setAmountOfPeople(userPeople);

        }
    }

    public double calculateTotalKcal() {
        double totalKcal = 0;
        for (Ingredient ingrediens : ingredientArray) {
            totalKcal += ingrediens.getKcal();
        }
        return totalKcal;
    }

    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Ingredient ingrediens : ingredientArray) {
            totalWeight += ingrediens.getWeightPrUnit();
        }
        return totalWeight;
    }

    public double calculateTotalKjoule() {
        double totalKjoule = 0;
        for (Ingredient ingrediens : ingredientArray){
            totalKjoule += ingrediens.getKJoule();
        }
        return totalKjoule;
    }

    public double calculateAverageKjoule() {
        double averageKjoule = 0;
        for (Ingredient ingrediens : ingredientArray) {
            averageKjoule += ingrediens.getKJoule() / userPeople;
        }
              return averageKjoule;
    }

    public double calculateAverageKcal() {
        double averageKcal = 0;
        for (Ingredient ingrediens : ingredientArray) {
            averageKcal += ingrediens.getKcal() / userPeople;
        }
        return averageKcal;
    }

    public double calculateAverageWeight() {
        double averageWeight = 0;
        for (Ingredient ingrediens : ingredientArray) {
            averageWeight += ingrediens.getWeightPrUnit() / userPeople;
        }
        return averageWeight;
    }

    //for each loop til at udskrive opskriften
    public void printOpskrift(){
        for (Ingredient ing : ingredientArray){
            System.out.println(ing);
        }
    }


}


