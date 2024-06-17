public class EXERCITII {

    public static void main(String[] args) {

        //apelare metodei learningjava prima  oara
        learningJava();
        //apelare metodei learningjava adoua oara
        learningJava();
        //apelera metodei learningjava a treia oara
        learningJava();

        //
        learning2Code("Java");
        learning2Code("Python");
        learning2Code("JavaScript");
        learning2Code("C++");

        // Apelarea metodei aflaNumarulMaiMare cu diversi parametri
        aflaNumarulMaiMare(10, 20);
        aflaNumarulMaiMare(30, 15);
        aflaNumarulMaiMare(5, 5); // Cazul in care numerele sunt egale

        // Apelarea metodei lungimeaCuvantului cu diversi parametri
        lungimeaCuvantului("Programare");
        lungimeaCuvantului("Java");
        lungimeaCuvantului("Metoda");

        System.out.println(sum(5, 10));
        System.out.println(concatenateTwoStrings("Cin", "dy"));

        System.out.println(invers(5));
        System.out.println(invers(-5));

        System.out.println(getMax(7, 9));
        System.out.println(getMax(3, 8));
        System.out.println(returneazaMediaAritmetica(10, 14, 18));

        System.out.println(concateneazaDouaStringuri("hello", "world"));
        System.out.println(("returneazaInversulUnuiString"));
        System.out.println(retuirnezaDacaENrPar(5));

        System.out.println(returneazaCaractereleDinMijloc("cuvant"));
        System.out.println(returneazaSumaCifrelor(82754));



    }

    //ex1
    private static void learningJava() {
        // Afiseaza textul "It's easy to learn limbajProgramare"
        System.out.println("It's easy to learn Java");
    }

    //ex2
    private static void learning2Code(String limbajProgramare) {
        // Afiseaza textul "It's easy to learn limbajProgramare"
        System.out.println("It's easy to learn " + limbajProgramare);

    }

    //ex3
    private static void aflaNumarulMaiMare(int numar1, int numar2) {

        // Determina numarul mai mare dintre cei doi
        int numarMaiMare = (numar1 > numar2) ? numar1 : numar2;

        // Afiseaza textul "Numarul mai mare este: x"
        System.out.println("Numarul mai mare este: " + numarMaiMare);
    }

    //ex4
    // Definirea metodei lungimeaCuvantului() cu un parametru de tip String
    private static void lungimeaCuvantului(String cuvant) {
        // Determina lungimea cuvantului
        int lungime = cuvant.length();
        // Afiseaza textul "Lungimea cuvantului dat este: x"
        System.out.println("Lungimea cuvantului dat este: " + lungime);
    }
    //ex5

    //metode cu return
    private static int sum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    private static String concatenateTwoStrings(String a, String b) {
        String concat = a + b;
        return concat;
    }
    //ex1-Scrieţi o metodă care prime te un numar întreg  i returneazș ș ă inversul lui
    // (ex. Inversul lui “4” e “-4”, inversul lui “-35” e “35”)


    private static int invers(int numar) {
        //int inversbun = - numar; prima varianta
        //return inversbun;
        //2 varianta
        return -numar;
    }

    //ex2-Scrieţi o metodă care primeste doua numere întregi  si returneaza maximul dintre ele
    private static int getMax(int d, int g) {
        if (d > g) {
            return d;
        } else {
            return g;
        }
    }

    //ex3-Scrieți o metodă care primeste 3 numere întregi
    //si returneaza media lor aritmetică (cu tot cu virgulă)
    private static double returneazaMediaAritmetica(int m, int n, int p) {
        return (m + n + p) / 3.0;
    }


    //ex4-Scrieți o metodă care primeste un String  si returnează lungimea lui

    // ex5-Scrieți o metodă care primeste doua Stringuri  si le concateneaza

    private static String concateneazaDouaStringuri(String q, String z) {
        String concat = q + z;
        return concat;
    }

    // ex6-Scrieți o metodă care primeste un String  si returnează inversul lui (ex. “abcd”->”dcba”)

    private static String returneazaInversulUnuiString(String cuvant) {
        String invers = "";
        int lungimeaStringului = cuvant.length();

        for (int i = lungimeaStringului - 1; i >= 0; i--) {
            invers = invers + cuvant.charAt(i);
        }
        return invers;
    }

    //exe optionale2
    public static boolean retuirnezaDacaENrPar(int numar) {
        return numar % 2==0;
    }
    //ex optional7
    private static String returneazaCaractereleDinMijloc(String cuvant){
        String mijloc;
        int lungime = cuvant.length();
        //nr litere impar-o singura litera
        if(lungime%2!=0){
            mijloc = cuvant.substring(lungime/2,lungime/2+1);//to be check
        }
        //nr litere par- doua litere
        else mijloc = cuvant.substring(lungime/2-1, lungime/2+1);
        return mijloc;
    }
    // optional 8
    public static int returneazaSumaCifrelor(int numar) {
        //if (numar < 0) {numar=-numar;}
        int sumaCifrelor=0;
        int rest;


        do {

            rest = numar % 10;
            numar = numar / 10;
            sumaCifrelor = sumaCifrelor+rest;
        }

        while (numar > 0);

        return sumaCifrelor;
    }

        }
















