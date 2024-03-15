package Part2.Macronutrient;

import Part2.Carbs.CarbsFactory;
import Part2.Customer.Customer;
import Part2.Fat.FatFactory;
import Part2.Meal.Meal;
import Part2.Protein.ProteinFactory;

import java.lang.reflect.InvocationTargetException;

public class PaleoMacroFactory extends MacronutrientFactory {
    private static PaleoMacroFactory instance;

    private PaleoMacroFactory() {
    }

    public static PaleoMacroFactory getInstance() {
        if (instance == null) {
            instance = new PaleoMacroFactory();
        }
        return instance;
    }

    @Override
    public Meal createMeal() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Meal meal = new Meal();
        CarbsFactory carbFact = CarbsFactory.getInstance();
        FatFactory fatFact = FatFactory.getInstance();
        ProteinFactory protFact = ProteinFactory.getInstance();

        meal.setCarb(carbFact.getCarbBasedOnDiet("paleo"));
        meal.setFat(fatFact.getFatBasedOnDiet("paleo"));
        meal.setProtein(protFact.getProteinBasedOnDiet("paleo"));
        return meal;

    }
}