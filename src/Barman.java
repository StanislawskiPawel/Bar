class BarmanTest {
    public static void main(String[] args) {
        Drink drink = Barman.createDrink("Sok ananasowy", 100, "Likier malibu", 50, "Mleko kokosowe", 100);
        Barman.printDrink(drink);
    }
}

public class Barman {

    public static Drink createDrink(String ingredient1, double amount1,
                                    String ingredient2, double amount2,
                                    String ingredient3, double amount3){
        Ingredient ing1 = new Ingredient(ingredient1, amount1);
        Ingredient ing2 = new Ingredient(ingredient2, amount2);
        Ingredient ing3 = new Ingredient(ingredient3, amount3);
        return new Drink(ing1, ing2, ing3);
    }

    public static void printDrink(Drink drink) {
        double ingredientSum = drink.getIngredient1().getAmount() +
                drink.getIngredient2().getAmount() +
                drink.getIngredient3().getAmount();
        double ing1Part = drink.getIngredient1().getAmount() / ingredientSum;
        double ing2Part = drink.getIngredient2().getAmount() / ingredientSum;
        double ing3Part = drink.getIngredient3().getAmount() / ingredientSum;
        System.out.printf("Składniki drinka to: %s, %s, %s " +
                        "w proporcjach %.2f, %.2f, %.2f." +
                        "Jego pojemność to %.0fml\n",
                drink.getIngredient1().getName(), drink.getIngredient2().getName(), drink.getIngredient3().getName(),
                ing1Part, ing2Part, ing3Part,
                ingredientSum);
    }


}
