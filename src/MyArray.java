import java.sql.SQLOutput;

public class MyArray {

    public static void main(String[] args) {

        int[] number = {1, 3, 5, 7, 9};
        String[] cursanti = {"Mihail", "Nicu", "Rebeca"};
        System.out.println(cursanti[0]);
        System.out.println(cursanti[2]);
        cursanti[2] = "Rebeca";
        System.out.println(cursanti[2]);
        System.out.println(cursanti.length);

        System.out.println(number.length);

        for (int i=0;i<cursanti.length;i++){
            System.out.println(cursanti[i]);}

            System.out.println("..................");

            for (String c:cursanti){
                System.out.println(c);}
            //dupa fiecare for sa inchidem }

                double sir[]={5.2,7.5,8.6,4.5};
                System.out.println(sir[1]);
                System.out.println(sir[3]);

                char[] myCharArray = {'a','b','c','d'};
                System.out.println(myCharArray[0]);
                System.out.println(myCharArray[1]);
                System.out.println(myCharArray[3]);

                for (int i=0; i<myCharArray.length; i++)
                {
                    System.out.println(myCharArray[i]);}





            }
        }





