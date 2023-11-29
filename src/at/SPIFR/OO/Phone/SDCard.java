package at.SPIFR.OO.Phone;

import at.SPIFR.OO.isahasa.Animal;

import java.util.ArrayList;
import java.util.List;

public class SDCard {

    private float capacily;

    private List<PhoneFile> phonefiles;


    public SDCard(float capacily) {
        this.capacily = capacily;
        this.phonefiles = new ArrayList<>();
    }

    public void addPfoneFile(PhoneFile phoneFile){
        this.phonefiles.add(phoneFile);
    }



    public float getCapacily() {
        return capacily;
    }

    public void setCapacily(float capacily) {
        this.capacily = capacily;
    }
}
