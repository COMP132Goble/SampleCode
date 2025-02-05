package arrayListAndLoops;

public class Demo {
    public static void main(String[] args) {
        VideoStore myStore = new VideoStore("Java Video Store");
        DVD movie1 = new DVD("Jurassic Park", "PG-13", 120, "Awesome");
        DVD movie2 = new DVD("Spider-Man", "PG-13", 90, "Superhero");
        myStore.addDVD(movie1);
        myStore.addDVD(movie2);
        // System.out.println("Our store has " + myStore.getListSize() + " DVDs");
        final double PI = 3.14159;
    }
}
