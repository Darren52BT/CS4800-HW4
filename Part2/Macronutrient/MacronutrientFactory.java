package Part2.Macronutrient;

import Part2.Customer.Customer;
import Part2.Meal.Meal;

import java.lang.reflect.InvocationTargetException;

public abstract class MacronutrientFactory {
    public abstract Meal createMeal() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;
}
