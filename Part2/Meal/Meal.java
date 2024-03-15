package Part2.Meal;

import Part2.Carbs.Carb;
import Part2.Fat.Fat;
import Part2.Protein.Protein;

public class Meal {
    private Carb carb;
    private Fat fat;
    private Protein protein;

    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }

    public Carb getCarb() {
        return carb;
    }

    public void setCarb(Carb carb) {
        this.carb = carb;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public void printMeal(){
        System.out.println(" Fat:" + this.fat.getName() + ", Carb: " + this.carb.getName() + ", Protein: " + this.protein.getName());
    }
}
