package at.SPIFR.OO.Lampe;

import java.util.ArrayList;
import java.util.List;

public class Lamp {


    private List<Element> elements;


    public Lamp() {
        this.elements = new ArrayList<>();
    }

    public void printNamesOfLightElements(){
        for (int i = 0; i < elements.size();i++){
            System.out.println(elements.get(i).getStrName());
        }
    };


    public float getOverallPowerUsage(){
        float fresult = 0;
        for (int i = 0; i < elements.size();i++){
            fresult = fresult + elements.get(i).getFpower();
        };
        return fresult;
    };

    public void turnAllOn(){
        for (int i = 0; i < elements.size();i++){
            elements.get(i).setBstate(true);
            System.out.println("Das "+ (i+1) +" Element wurde eingeschaltet");
            elements.get(i).setFpower(elements.get(i).getFpower()+1);
        }

    }

    public void addElement(Element element) {
        this.elements.add(element);

    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}
