package Interfaces;

public class Duck implements MakesSound{
    private String species;

    public Duck(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return this.species;
    }

    public void makeSound() {
        System.out.println("Quack Quack");
    }

    public int howLoud() {
        return 4;
    }
}
