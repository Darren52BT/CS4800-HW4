package Part2.Protein;

public abstract class Protein {
    private final String name;

    public Protein(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
