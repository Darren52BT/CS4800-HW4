package Part2.Protein;

import Part2.HelperMethods;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class ProteinFactory {

    private static ProteinFactory instance;

    private ProteinFactory() {
    }

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public Protein getProteinBasedOnDiet(String diet) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ArrayList<Class<? extends Protein>> paleo = new ArrayList<>();
        paleo.add(ProteinFactory.Fish.class);
        paleo.add(ProteinFactory.Chicken.class);
        paleo.add(ProteinFactory.Beef.class);

        ArrayList<Class<? extends Protein>> vegan = new ArrayList<>();
        vegan.add(ProteinFactory.Tofu.class);


        ArrayList<Class<? extends Protein>> nutAllergy = new ArrayList<>();
        nutAllergy.add(ProteinFactory.Fish.class);
        nutAllergy.add(ProteinFactory.Chicken.class);
        nutAllergy.add(ProteinFactory.Chicken.class);
        nutAllergy.add(ProteinFactory.Beef.class);

        ArrayList<Class<? extends Protein>> noRes = new ArrayList<>();
        noRes.add(ProteinFactory.Fish.class);
        noRes.add(ProteinFactory.Chicken.class);
        noRes.add(ProteinFactory.Chicken.class);
        noRes.add(ProteinFactory.Beef.class);


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

    static class Fish extends Protein {
        public Fish() {
            super("fish");
        }
    }

    static class Chicken extends Protein {
        public Chicken() {
            super("chicken");
        }
    }

    static class Beef extends Protein {
        public Beef() {
            super("beef");
        }
    }

    static class Tofu extends Protein {
        public Tofu() {
            super("tofu");
        }
    }

}
