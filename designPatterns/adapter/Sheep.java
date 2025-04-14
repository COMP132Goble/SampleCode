package designPatterns.adapter;

public class Sheep implements MakesSound {
    public void produceSound() {
        System.out.println("Baaaaaaaa");
    }

    public int howLoud() {
        return 4;
    }
}
