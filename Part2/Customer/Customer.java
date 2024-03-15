package Part2.Customer;

import Part2.Meal.Meal;

public class Customer {

    private String name;
    private String diet;

    private Meal meal;

    public Customer(String name, String diet) {
        this.name = name;
        switch (diet) {
            case "paleo":
            case "vegan":
            case "nut allergy":
                this.diet = diet;
                break;
            default:
                this.diet = "no restriction";
                break;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiet(String diet) {
        switch (diet) {
            case "paleo":
            case "vegan":
            case "nut allergy":
                this.diet = diet;
                break;
            default:
                this.diet = "no restriction";
                break;
        }
    }

    public String getDiet() {
        return diet;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public void printDiet() {
        System.out.print("Name: " + this.name + ", Diet: " + this.diet + ", ");
        this.meal.printMeal();
    }
}
