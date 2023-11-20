package at.SPIFR.OO.Lampe;

public class Test {


    public static void main(String[] args) {

        Lamp lamp1 = new Lamp();
        Element element1 = new Element("1",0,"green",false);
        Element element2 = new Element("2",0,"blue",false);
        Element element3 = new Element("3",0,"red",false);
        Element element4 = new Element("4",0,"green",false);

        lamp1.addElement(element1);
        lamp1.addElement(element2);
        lamp1.addElement(element3);
        lamp1.addElement(element4);

        lamp1.printNamesOfLightElements();
        lamp1.turnAllOn();

        System.out.println(lamp1.getOverallPowerUsage());




    }

}
