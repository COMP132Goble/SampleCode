package Inheritance.practice.abstractClass;

import java.util.ArrayList;

public abstract class Human {
    private String name;
    protected int bouns;
    protected int hitDie;
    protected ArrayList<String> proficiencies;


    public Human(String name, int hitDie) {
        this.name = name;
        this.bouns = 1;
        this.hitDie = hitDie;
        this.proficiencies = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    abstract public void setProficiencies();
}
