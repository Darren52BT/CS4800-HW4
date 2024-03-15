package Part2.Macronutrient;

import Part2.Carbs.CarbsFactory;
import Part2.Customer.Customer;
import Part2.Fat.FatFactory;
import Part2.Meal.Meal;
import Part2.Protein.ProteinFactory;

import java.lang.reflect.InvocationTargetException;

public class NutAllergyMacroFactory extends MacronutrientFactory {
    private static NutAllergyMacroFactory instance;

    private NutAllergyMacroFactory() {
    }

    public static NutAllergyMacroFactory getInstance() {
        if (instance == null) {
            instance = new NutAllergyMacroFactory();
        }
        return instance;
    }

    @Override
    public Meal createMeal() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Meal meal = new Meal();
        CarbsFactory carbFact = CarbsFactory.getInstance();
        FatFactory fatFact = FatFactory.getInstance();
        ProteinFactory protFact = ProteinFactory.getInstance();

        meal.setCarb(carbFact.getCarbBasedOnDiet("nut allergy"));
        meal.setFat(fatFact.getFatBasedOnDiet("nut allergy"));
        meal.setProtein(protFact.getProteinBasedOnDiet("nut allergy"));
        return meal;

    }
}