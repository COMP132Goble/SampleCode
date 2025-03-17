package Inheritance.practice.abstractClass;

public class Barbarian extends Human {
    public Barbarian(String name) {
        super(name, 12);
        setProficiencies();
    }

    public void setProficiencies() {
        proficiencies.add("Athletics");
        proficiencies.add("Intimidation");
        proficiencies.add("Survival");
    }
}
