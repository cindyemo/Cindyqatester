import java.sql.SQLOutput;
import java.util.concurrent.LinkedTransferQueue;

public class Operators {
    public static void main(String[]args)
    {
        int a = 100;
        int b = 50;
        int c = 30;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(a%c);

        //System.out.println(++a); prima data icrementeaza si apoi face ceva cu el
        // (a++ - prima data face ceva cu el  si dupa icreementeaza
        System.out.println(a++);
        System.out.println(a);

        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

        System.out.println(100+50);
        System.out.println(a+b);
        System.out.println(a+50);

        //operator de atribuire
        int d = 10;
        int e = d;

        //d = d+2;
        d+=2; //echivelant cu d = d+2
        System.out.println(d);

        d-= 3; //echivalnet d = d-3;
        System.out.println(d);

        // FOR (STRAT; STOP; PAS;{
        //DO SOMTHING}

        for (int i=0; i<=10; i+=2){
            System.out.println(i);
        }
        for (int i=10; i>=0; i--){
            System.out.println(i);
        }
        //OPERTORI DE COMPARARE

        System.out.println(a>b);
        System.out.println(b>a);

        System.out.println(a>=b);
        System.out.println(b>=a);

        System.out.println(5==5);
        System.out.println(a==b);
        //= simplu la atribuire
        //== dublu la comparare

        System.out.println(a!=b);

        boolean iLoveJava = false;
        System.out.println(!iLoveJava);
       // System.out.println(!iLoveJava);// smenul '!' inverseaza de exemplu true va deveni fals

        if (iLoveJava) {
            System.out.println("Learn Test Automation");
        }
        else {
            System.out.println("Still Learning");

        }
        //OPERATORI LOGICI

        System.out.println(d);//d=9
        System.out.println(e);//e=10

        if (d<10 && e<=10){
            System.out.println("d si e mai mici decat 10");
            // && = insemna SI
        }
        if (d<10 || e<=10){
            System.out.println("d sau e mai mici decat 10");
            // || = Insemna SAU
        }
        int x = 10;
        int y = 5;
        System.out.println(10*5);
        System.out.println(10/5);
        System.out.println(++x);
        System.out.println(+5);

        int o = 5;
        int p = 6;
        int sum = o+p;
        if (sum>=10){
        System.out.println("sum>=10");
        }
        if (sum%2==0){
            System.out.println("suma este numar par");
        }
        //EXERCITI OPTIONALE
        //1.
        int var1 = 5;
        int var2 = 10;
        int var3 = 15;
        int var4 = 20;
        int suma = var1+var2+var3+var4;
        int produs = var1*var2*var3*var4;
        System.out.println(suma);
        System.out.println(var1+var2+var3+var4);
        System.out.println(var1*var2*var3*var4);
        System.out.println(var4/var2);

        for (int i = 1; i>=3; i++);{
        var1++;
    }
        System.out.println(var1);

               //2.
        var1 = 5;

        // incrementam var1 cu o unitate de 3 ori
        var1++;
        var1++;
        var1++;

        //afisam var1 dupa cea de-a treia incrementare
        System.out.println("Valoarea lui var1a după a treia incrementare" +var1);
        // sau se poate varianta uramtoare pentru exrcitiul 2
        // " for(int i = 0; i<3; i++){
        //}
        // system.out.println(var1);

             //.3
        for (int i=0; i<2; i++){
            var2 -= 2; // var2 = var2 - 2;
        }
        System.out.println(var2);
              //4.
        //declarati doua variabile tip boolean cond1 si cond2

        boolean cond1;
        boolean cond2;

        if (suma > 100) {
            cond1 = true;
        }
        else {
            cond1 = false;
        }

        if (produs > 1000){
            cond2 = true;
        }
        else{
            cond2 = false;
        }
        System.out.println("cond1 (suma > 100):" +cond1);
        System.out.println("cond2 ( produs > 1000):" +cond2);

              //5
        if(cond1==true || cond2==true){
            System.out.println("true");

        }
        else {
            System.out.println("false");
        }
        if(cond1==true && cond2==true){
            System.out.println("true");

        }
        else {
            System.out.println("false");
        }





    }
}
