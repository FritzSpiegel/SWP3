package at.SPIFR.OO.Phone;

import at.SPIFR.OO.Fernbedinung.Battery;
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



    public void addBattery(PhoneFile phoneFile) {

        if (capacily < phoneFile.getSize()){
            System.out.println("Sie haben nicht mehr genügend Speicherplatz zur verfügung.\n");
        }else {
            System.out.println("Das Bild " + phoneFile.getName() + " wurde auf der SDCard gespiechert\n");
            this.phonefiles.add(phoneFile);
            this.capacily =this.capacily - phoneFile.getSize();
        }
    };



    public void getFreeSpace(){
        System.out.println("Sie haben noch: " + capacily + "Bit freien Speicherplatz\n");

    };

    public void getAllFiles(){


        for (int i = 0; i < phonefiles.size(); i++) {
            System.out.println(i+1 + "Bild: ");
            System.out.println(phonefiles.get(i).getName() + "." + phonefiles.get(i).getExtension());

            System.out.println("Verbruacht: " + phonefiles.get(i).getSize() + " Bit\n");

        }
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
