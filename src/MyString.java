public class MyString {

    public static void main(String[] args) {
        String text = "Hello ";
        String nume = "Cindy";
        System.out.println(text);
        String numeMare = nume.toUpperCase();
        System.out.println(numeMare);
        String numeMic = nume.toLowerCase();
        System.out.println(numeMic);

        String propozitie = "Ana are mere";
        int lungime = propozitie.length();
        System.out.println(lungime);

        char primalitera = propozitie.charAt(0);
        System.out.println(primalitera);
        char a6alitera = propozitie.charAt(5);
        System.out.println(a6alitera);

        String filmulPreferat = "Filmul meu preferat este \n\"Harry Potter\"" ;
        System.out.println(filmulPreferat);

        String tara = "Grecia";
        int lungimeatari = tara.length(); // calculeaza nr caractere dintr-un string
        System.out.println(lungimeatari);




        String myFavouriteMovie = "Great Expectations";
        System.out.println("My favourite movie is \"" + myFavouriteMovie + "\"");

        System.out.println(myFavouriteMovie.toUpperCase());
        System.out.println(myFavouriteMovie.toLowerCase());

        int lungime2 = myFavouriteMovie.length();
        System.out.println(lungime2);














    }
}
