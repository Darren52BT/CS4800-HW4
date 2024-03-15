package Part2.Carbs;

import Part2.HelperMethods;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class CarbsFactory {

    private static CarbsFactory instance;

    private CarbsFactory() {
    }

    public static CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }

    public Carb getCarbBasedOnDiet(String diet) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ArrayList<Class<? extends Carb>> paleo = new ArrayList<>();
        paleo.add(Pistachio.class);

        ArrayList<Class<? extends Carb>> vegan = new ArrayList<>();
        vegan.add(Pistachio.class);
        vegan.add(Lentils.class);
        vegan.add(Bread.class);

        ArrayList<Class<? extends Carb>> nutAllergy = new ArrayList<>();
        nutAllergy.add(Cheese.class);
        nutAllergy.add(Bread.class);
        nutAllergy.add(Lentils.class);

        ArrayList<Class<? extends Carb>> noRes = new ArrayList<>();
        noRes.add(Cheese.class);
        noRes.add(Bread.class);
        noRes.add(Lentils.class);
        noRes.add(Pistachio.class);


        return switch (diet) {
            case "paleo" ->
                    paleo.get(HelperMethods.getRandomIndex(paleo.size())).getDeclaredConstructor().newInstance();
            case "vegan" ->
                    vegan.get(HelperMethods.getRandomIndex(vegan.size())).getDeclaredConstructor().newInstance();
            case "nut allergy" ->
                    nutAllergy.get(HelperMethods.getRandomIndex(nutAllergy.size())).getDeclaredConstructor().newInstance();
            default -> noRes.get(HelperMethods.getRandomIndex(noRes.size())).getDeclaredConstructor().newInstance();
        };
    }

    static class Cheese extends Carb {
        public Cheese() {
            super("cheese");
        }
    }

    static class Bread extends Carb {
        public Bread() {
            super("bread");
        }
    }

    static class Lentils extends Carb {
        public Lentils() {
            super("lentils");
        }
    }

    static class Pistachio extends Carb {
        public Pistachio() {
            super("pistachio");
        }
    }


}
