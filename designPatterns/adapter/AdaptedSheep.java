package designPatterns.adapter;

public class AdaptedSheep implements MakesNoise {
    private Sheep sheep;

    public AdaptedSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    public int getVolume() {
        return sheep.howLoud();
    }
}
