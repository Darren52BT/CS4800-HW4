package Part1;

public class Driver {
    public static void main(String[] args) {
        //For part 1
        System.out.println("Part 1");
        PizzaBuilder.Pizza pizza1 = new PizzaBuilder("small").setChain("Pizza Hut").addBacon().addPepperoni().addChicken().bake();
        PizzaBuilder.Pizza pizza2 = new PizzaBuilder("medium").setChain("Pizza Hut").addOlives().addHam().addExtraCheese().addBeef().addPepperoni().addOnions().bake();
        PizzaBuilder.Pizza pizza3 = new PizzaBuilder("large").setChain("Pizza Hut").addHamAndPineapple().addMushrooms().addBeef().addExtraCheese().addOnions().addSpicyPork().addPeppers().addSpinach().addTomatoandBasil().bake();
        pizza1.eat();
        pizza2.eat();
        pizza3.eat();


        //Part 2
        System.out.println("\nPart 2\n");
        //Pizza hut
        PizzaBuilder.Pizza pizza4 = new PizzaBuilder("large").setChain("Pizza Hut").addSpinach().addTomatoandBasil().addOnions().bake();
        PizzaBuilder.Pizza pizza5 = new PizzaBuilder("small").setChain("Pizza Hut").addPepperoni().addOnions().bake();
        pizza4.eat();
        pizza5.eat();


        //Little Caesars
        PizzaBuilder.Pizza pizza6 = new PizzaBuilder("medium").setChain("Little Caesars").addBeef().addBacon().addHam().addSpicyPork().addSausage().addExtraCheese().addMushrooms().addOlives().bake();
        PizzaBuilder.Pizza pizza7 = new PizzaBuilder("small").setChain("Little Caesars").addPepperoni().addSpinach().addSausage().addSpicyPork().addPeppers().addOnions().bake();
        pizza6.eat();
        pizza7.eat();

        //Dominos

        PizzaBuilder.Pizza pizza8 = new PizzaBuilder("small").setChain("Dominos").addBeef().bake();
        PizzaBuilder.Pizza pizza9 = new PizzaBuilder("large").setChain("Dominos").addPepperoni().addSpinach().addOnions().bake();
        pizza8.eat();
        pizza9.eat();
    }
}
