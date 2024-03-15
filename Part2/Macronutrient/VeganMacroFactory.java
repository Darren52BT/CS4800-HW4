package Part2.Macronutrient;

import Part2.Carbs.CarbsFactory;
import Part2.Customer.Customer;
import Part2.Fat.FatFactory;
import Part2.Meal.Meal;
import Part2.Protein.ProteinFactory;

import java.lang.reflect.InvocationTargetException;

public class VeganMacroFactory extends MacronutrientFactory {
    private static VeganMacroFactory instance;

    private VeganMacroFactory() {
    }

    public static VeganMacroFactory getInstance() {
        if (instance == null) {
            instance = new VeganMacroFactory();
        }
        return instance;
    }

    @Override
    public Meal createMeal() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Meal meal = new Meal();
        CarbsFactory carbFact = CarbsFactory.getInstance();
        FatFactory fatFact = FatFactory.getInstance();
        ProteinFactory protFact = ProteinFactory.getInstance();

        meal.setCarb(carbFact.getCarbBasedOnDiet("vegan"));
        meal.setFat(fatFact.getFatBasedOnDiet("vegan"));
        meal.setProtein(protFact.getProteinBasedOnDiet("vegan"));
        return meal;

    }
}