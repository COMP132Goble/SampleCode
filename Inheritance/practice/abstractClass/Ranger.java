package Inheritance.practice.abstractClass;

public class Ranger extends Human {
    public Ranger(String name) {
        super(name, 10);
        setProficiencies();
    }

    public void setProficiencies() {
        proficiencies.add("Animal Handling");
        proficiencies.add("Insight");
        proficiencies.add("Investigation");
    }
}
