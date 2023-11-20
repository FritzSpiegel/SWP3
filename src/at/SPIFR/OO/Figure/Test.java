package at.SPIFR.OO.Figure;

public class Test {

    public static void main(String[] args) {


        Quadrat Q1 = new Quadrat("Quadrat1",5);

        Viereck V1 = new Viereck("Viereck",5,9);

        Würfel W1 = new Würfel("Würfel",5,19);

        System.out.println(Q1.getName());
        System.out.println(Q1.getArea());

        System.out.println(V1.getName());
        System.out.println(V1.getArea());

        System.out.println(W1.getName());
        System.out.println(W1.getArea());

    }


}
