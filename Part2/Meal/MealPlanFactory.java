package Part2.Meal;

import Part2.Customer.Customer;
import Part2.Macronutrient.*;

public class MealPlanFactory {
    private static MealPlanFactory instance;

    private MealPlanFactory()
    {
    }

    public static MealPlanFactory getInstance()
    {
        if (instance == null)
        {
            instance = new MealPlanFactory();
        }

        return instance;
    }


    public MacronutrientFactory getMacroFactory(Customer customer){
        return switch (customer.getDiet()) {
            case "paleo" -> PaleoMacroFactory.getInstance();
            case "vegan" -> VeganMacroFactory.getInstance();
            case "nut allergy" -> NutAllergyMacroFactory.getInstance();
            default -> NoResMacroFactory.getInstance();
        };
    }


}
