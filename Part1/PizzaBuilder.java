package Part1;

import java.util.ArrayList;

public class PizzaBuilder {
    private ArrayList<String> toppings;
    private String size;
    private String chain;

    public class Pizza {

        private ArrayList<String> toppings;
        private String size;

        private String chain;

        public Pizza(ArrayList<String> toppings, String size, String chain) {

            this.toppings = new ArrayList<String>();
            this.toppings.addAll(toppings);
            this.size = size;
            this.chain = chain;
        }


        public void eat() {
            System.out.print(this.chain + ": " + this.size + " pizza with ");
            for (int i = 0; i < toppings.size(); i++) {
                if (i < toppings.size() - 1) {
                    System.out.print(toppings.get(i) + ", ");
                } else {
                    System.out.println("and " + toppings.get(i) + ".");
                }
            }
        }

    }

    public PizzaBuilder(String size) {
        this.toppings = new ArrayList<String>();
        this.chain = null;
        switch (size.toLowerCase()) {
            case "small":
            case "medium":
            case "large":
                this.size = size.toLowerCase();
                break;
            default:
                this.size = "small";
                break;
        }
    }

    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        switch (size.toLowerCase()) {
            case "small":
            case "medium":
            case "large":
                this.size = size.toLowerCase();
                break;
            default:
                this.size = "small";
                break;
        }
        return this;
    }

    public PizzaBuilder addPepperoni() {
        if (isToppingAbsent("pepperoni")) {
            this.toppings.add("pepperoni");
        }
        return this;
    }

    public PizzaBuilder addSausage() {
        if (isToppingAbsent("sausage")) {
            this.toppings.add("sausage");
        }
        return this;
    }

    public PizzaBuilder addMushrooms() {
        if (isToppingAbsent("mushrooms")) {
            this.toppings.add("mushrooms");
        }
        return this;
    }

    public PizzaBuilder addBacon() {
        if (isToppingAbsent("bacon")) {
            this.toppings.add("bacon");
        }
        return this;
    }

    public PizzaBuilder addOnions() {
        if (isToppingAbsent("onions")) {
            this.toppings.add("onions");
        }
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        if (isToppingAbsent("extra cheese")) {
            this.toppings.add("extra cheese");
        }
        return this;
    }

    public PizzaBuilder addPeppers() {
        if (isToppingAbsent("peppers")) {
            this.toppings.add("peppers");
        }
        return this;
    }

    public PizzaBuilder addChicken() {
        if (isToppingAbsent("chicken")) {
            this.toppings.add("chicken");
        }
        return this;
    }

    public PizzaBuilder addOlives() {
        if (isToppingAbsent("olives")) {
            this.toppings.add("olives");
        }
        return this;
    }

    public PizzaBuilder addSpinach() {
        if (isToppingAbsent("spinach")) {
            this.toppings.add("spinach");
        }
        return this;
    }

    public PizzaBuilder addTomatoandBasil() {
        if (isToppingAbsent("tomato and basil")) {
            this.toppings.add("tomato and basil");
        }
        return this;
    }

    public PizzaBuilder addBeef() {
        if (isToppingAbsent("beef")) {
            this.toppings.add("beef");
        }
        return this;
    }

    public PizzaBuilder addHam() {
        if (isToppingAbsent("ham")) {
            this.toppings.add("ham");
        }
        return this;
    }

    public PizzaBuilder addPesto() {
        if (isToppingAbsent("pesto")) {
            this.toppings.add("pesto");
        }
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        if (isToppingAbsent("spicy pork")) {
            this.toppings.add("spicy pork");
        }
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        if (isToppingAbsent("ham and pineapple")) {
            this.toppings.add("ham and pineapple");
        }
        return this;
    }

    public Pizza bake() {
        if (this.size == null || this.chain == null) {
            return null;
        }
        return new Pizza(toppings, size, chain);
    }


    //helper method for seeing if topping exists
    private boolean isToppingAbsent(String searchTopping) {
        for (String topping : this.toppings) {
            if (topping.equals(searchTopping)) {
                return false;
            }
        }
        return true;
    }


}
