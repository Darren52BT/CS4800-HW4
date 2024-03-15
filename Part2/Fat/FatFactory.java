package Part2.Fat;

import Part2.HelperMethods;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class FatFactory {
    private static FatFactory instance;

    private FatFactory() {
    }

    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public Fat getFatBasedOnDiet(String diet) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ArrayList<Class<? extends Fat>> paleo = new ArrayList<>();
        paleo.add(FatFactory.Avocado.class);
        paleo.add(FatFactory.Tuna.class);
        paleo.add(FatFactory.Peanuts.class);


        ArrayList<Class<? extends Fat>> vegan = new ArrayList<>();
        vegan.add(FatFactory.Avocado.class);
        vegan.add(FatFactory.Peanuts.class);


        ArrayList<Class<? extends Fat>> nutAllergy = new ArrayList<>();
        nutAllergy.add(FatFactory.Avocado.class);
        nutAllergy.add(FatFactory.SourCream.class);
        nutAllergy.add(FatFactory.Tuna.class);


        ArrayList<Class<? extends Fat>> noRes = new ArrayList<>();
        noRes.add(FatFactory.Avocado.class);
        noRes.add(FatFactory.SourCream.class);
        noRes.add(FatFactory.Tuna.class);
        noRes.add(FatFactory.Peanuts.class);


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

    static class Avocado extends Fat {
        public Avocado() {
            super("avocado");
        }
    }

    static class SourCream extends Fat {
        public SourCream() {
            super("sour cream");
        }
    }

    static class Tuna extends Fat {
        public Tuna() {
            super("tuna");
        }
    }

    static class Peanuts extends Fat {
        public Peanuts() {
            super("peanuts");
        }
    }


}
