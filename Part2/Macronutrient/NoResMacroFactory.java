package Part2.Macronutrient;

import Part2.Carbs.CarbsFactory;
import Part2.Customer.Customer;
import Part2.Fat.FatFactory;
import Part2.Meal.Meal;
import Part2.Protein.ProteinFactory;

import java.lang.reflect.InvocationTargetException;

public class NoResMacroFactory extends MacronutrientFactory {
    private static NoResMacroFactory instance;

    private NoResMacroFactory() {
    }

    public static NoResMacroFactory getInstance() {
        if (instance == null) {
            instance = new NoResMacroFactory();
        }
        return instance;
    }

    @Override
    public Meal createMeal() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Meal meal = new Meal();
        CarbsFactory carbFact = CarbsFactory.getInstance();
        FatFactory fatFact = FatFactory.getInstance();
        ProteinFactory protFact = ProteinFactory.getInstance();

        meal.setCarb(carbFact.getCarbBasedOnDiet("no restriction"));
        meal.setFat(fatFact.getFatBasedOnDiet("no restriction"));
        meal.setProtein(protFact.getProteinBasedOnDiet("no restriction"));
        return meal;

    }
}
