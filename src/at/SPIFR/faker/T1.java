package at.SPIFR.faker;

import com.github.javafaker.Faker;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;

public class T1 {

    public static void main(String[] args) {

        Faker faker = new Faker(new Locale("DE-AT"));

        System.out.println();

        try {
            FileWriter myWriter = new FileWriter("InsertDataKunden.txt");

            for(int i = 0; i < 100; i ++){
                String firstName = faker.name().firstName(); // Emory
                String lastName = faker.name().lastName(); // Barton

                String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

                if(i == 99){
                    myWriter.write(
                                "('"+firstName + "','" + lastName  +"','"  +streetAddress +"');"+ "\n");
                }else {
                    myWriter.write(
                                "('"+firstName + "','" + lastName  +"','"  +streetAddress +"'),"+ "\n");
                };
            };
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



        try {
            FileWriter myWriter = new FileWriter("InsertDataMitarbeiter.txt");

            for(int i = 0; i < 100; i ++){
                String firstName = faker.name().firstName(); // Emory
                String lastName = faker.name().lastName(); // Barton

                String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

                if(i == 99){
                    myWriter.write(
                            "('"+firstName + "','" + lastName  +"','"  +streetAddress +"');"+ "\n");
                }else {
                    myWriter.write(
                            "('"+firstName + "','" + lastName  +"','"  +streetAddress +"'),"+ "\n");
                };
            };
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        try {
            FileWriter myWriter = new FileWriter("InsertDataProdukte.txt");

            for(int i = 0; i < 100; i ++){
                String productname = faker.funnyName().name(); // Emory

                int zufall = (int) (5*Math.random())+1;

                int zufall2 = (int) (5*Math.random());

                String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449

                if(i == 99){
                    myWriter.write(
                            "('"+productname + "','" + zufall  +"','"  + zufall2 +"');"+ "\n");
                }else {
                    myWriter.write(
                            "('"+productname + "','" + zufall  +"','"  + zufall2 +"'),"+ "\n");
                };
            };

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



        try {
            FileWriter myWriter = new FileWriter("InsertDataVermietung.txt");

            for(int i = 0; i < 100; i ++){


                int zufall = (int) (5*Math.random()+1);

                int zufall1 = (int) (5*Math.random()+1);

                int zufall2 = (int) (5*Math.random() * zufall1);


                if(i == 99){
                    myWriter.write(
                            "('"+ (i +1)+ "','" + zufall  +"','"  + zufall1 + "','" + zufall2+ "');"+ "\n");
                }else {
                    myWriter.write(
                            "('"+ (i +1) + "','" + zufall  +"','"  + zufall1 + "','" + zufall2+ "'),"+ "\n");
                };
            };

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }

}
