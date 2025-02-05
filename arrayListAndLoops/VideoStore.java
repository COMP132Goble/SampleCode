package arrayListAndLoops;

import java.util.ArrayList;

public class VideoStore {
    private String storeName;
    // how can we store our collection of DVDs?
    private ArrayList<DVD> listVideos;

    /**
     * Constructor method that will initialize 
     * the memeber data.
     * 
     * Should it have parameters? If so, what?
     */
    public VideoStore(String name) {
        storeName = name;
        listVideos = new ArrayList<DVD>();
    }

    /**
     * How could we return the number of DVDs 
     * that the VideoStore has? 
     * Things to consider: 
     *  - What would a good name for this method be?
     *  - How are we keeping track of our DVDs?
     *  - What should the return type be for this method?
     *  - Should it have parameters? If so, what?
     */
    public int getListSize() {
        return listVideos.size();
    }

    /**
     * How could we add a DVD to our collection of movies?
     * Things to consider:
     *  - What would a good name for this method be?
     *  - How are we keeping track of our DVDs?
     *  - What should the return type be for this method?
     *  - Should it have parameters? If so, what?
     */
    public void addDVD(DVD movie) {
        listVideos.add(movie);
    }

    /**
     * How could we get one of the DVDs from our collection?
     * Things to consider:
     *  - What would a good name for this method be?
     *  - How are we keeping track of our DVDs?
     *  - What should the return type be for this method?
     *  - Should it have parameters? If so, what?
     */
    public DVD getDVD(int index) {
        DVD target;
        if (index >= 0 && index < listVideos.size()) {
            target = listVideos.get(index);
            return target;
        }
    
        return null;
    }

    public void removeDVD(int index) {
        if (index >= 0 && index < listVideos.size()) {
            listVideos.remove(index);
        }
    }

    public void printAllDVDs() {
        DVD aDVD = listVideos.get(0);
        String str = aDVD.toString();
        System.out.println(str);

        aDVD = listVideos.get(1);
        str = aDVD.toString();
        System.out.println(aDVD);

        aDVD = listVideos.get(2);
        str = aDVD.toString();
        System.out.println(aDVD);

        aDVD = listVideos.get(3);
        str = aDVD.toString();
        System.out.println(aDVD);

        aDVD = listVideos.get(4);
        str = aDVD.toString();
        System.out.println(aDVD);

        aDVD = listVideos.get(5);
        str = aDVD.toString();
        System.out.println(aDVD);
    }
}
