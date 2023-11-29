package at.SPIFR.OO.Phone;

public class PhoneFile {

    private String extension;
    private float size;
    private String name;


    public PhoneFile(String extension, float size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
