public class Ifclass {
    public static void main(String[] args) {
        int time = 8;

        if (time>24||time<0){
            System.out.println("incorrect time");
        }

        if (time >18){
            System.out.println("Good evening!");
        }
        else if(time>12) {
            System.out.println("Good day!");
        }
        else System.out.println("Good morning!");

        int dayNumber = 9;

        switch (dayNumber){
            case 1: System.out.println("luni"); break;
            case 2: System.out.println("marti"); break;
            case 3: System.out.println("miercuri"); break;
            case 4: System.out.println("joi"); break;
            case 5: System.out.println("vineri"); break;
            case 6: System.out.println("sambata"); break;
            case 7: System.out.println("duminica"); break;
            default:
                System.out.println("ziua nu este valida");
        }

        // Variabilă pentru numele persoanei sărbătorite
        String name = "Gabriel";

        // Folosim un ciclu for pentru a repeta versurile de două ori
        for (int i = 0; i < 2; i++) {
            printVerse(name);
        }
    }

    // Metodă pentru a afișa versurile cântecului
    public static void printVerse(String name) {
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday dear " + name);
        System.out.println("Happy birthday to you");


    }
}
