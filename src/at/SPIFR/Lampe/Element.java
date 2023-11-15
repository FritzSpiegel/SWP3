package at.SPIFR.Lampe;

public class Element {

    private String strName;
    private float fpower;
    private String strColor;
    private boolean bstate;


    public Element(String strName, float fpower, String strColor, boolean bstate) {
        this.strName = strName;
        this.fpower = fpower;
        this.strColor = strColor;
        this.bstate = bstate;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public float getFpower() {
        return fpower;
    }

    public void setFpower(float fpower) {
        this.fpower = fpower;
    }

    public String getStrColor() {
        return strColor;
    }

    public void setStrColor(String strColor) {
        this.strColor = strColor;
    }

    public boolean isBstate() {
        return bstate;
    }

    public void setBstate(boolean bstate) {
        this.bstate = bstate;
    }
}
