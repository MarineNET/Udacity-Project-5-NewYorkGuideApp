package viktorkhon.com.udacity_project_5_newyorkguideapp;

/**
 * Created by Viktor Khon on 8/13/2017.
 */

public class Recommendation {

    private int mTitle;
    private int mAddress;
    private int mDescription;
    private int mImage;

    public Recommendation(int title, int address, int description, int image) {
        mTitle = title;
        mAddress = address;
        mDescription = description;
        mImage = image;
    }

    public Recommendation(int title, int address, int description) {
        mTitle = title;
        mAddress = address;
        mDescription = description;
    }

    public Recommendation(int title, int description) {
        mTitle = title;
        mDescription = description;
    }

    public boolean hasImage() {
        if (mImage <= 0) {
            return false;
        }
        return true;
    }

    public int getTitle() {
        return mTitle;
    }

    public int getAddress() {
        return mAddress;
    }

    public int getDescription() {
        return mDescription;
    }

    public int getImage() {
        return mImage;
    }
}
