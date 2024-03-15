package Part2;

import Part2.Customer.Customer;
import Part2.Meal.MealPlanFactory;

import java.lang.reflect.InvocationTargetException;

public class Driver {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Customer cust1 = new Customer("Bob", "paleo");
        Customer cust2 = new Customer("Joey", "paleo");
        Customer cust3 = new Customer("Mark", "vegan");
        Customer cust4 = new Customer("Mary", "nut allergy");
        Customer cust5 = new Customer("Jacob", "no restriction");
        Customer cust6 = new Customer("Jackson", "vegan");

        MealPlanFactory mealPlanFactory = MealPlanFactory.getInstance();
        cust1.setMeal(mealPlanFactory.getMacroFactory(cust1).createMeal());
        cust2.setMeal(mealPlanFactory.getMacroFactory(cust2).createMeal());
        cust3.setMeal(mealPlanFactory.getMacroFactory(cust3).createMeal());
        cust4.setMeal(mealPlanFactory.getMacroFactory(cust4).createMeal());
        cust5.setMeal(mealPlanFactory.getMacroFactory(cust5).createMeal());
        cust6.setMeal(mealPlanFactory.getMacroFactory(cust6).createMeal());

        cust1.printDiet();
        cust2.printDiet();
        cust3.printDiet();
        cust4.printDiet();
        cust5.printDiet();
        cust6.printDiet();

    }
}
