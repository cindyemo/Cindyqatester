public class TryCatch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            System.out.println(numbers[9]);
        } catch (Exception e) {
            System.out.println("A aparut o eroare");
        }

        //exerciti
        //1.
        for (int i=0; i<=10; i++){
            System.out.println(i);
        }
        //2.
        for (int i=20; i>=10; i--){
            System.out.println(i);
        }
        //3.
        for (int i = 2; i<=100; i+=2){
            System.out.println(i);
        }
        //4.

        String fructe [] = {"mere", "capsuni", "pere", "banane"};
        for (String c : fructe){
            System.out.println("imi place sa manac " +c);
        }
        //5.
        int NumeLuna = 9;

        switch (NumeLuna){
            case 1: System.out.println("ianuarie"); break;
            case 2: System.out.println("februarie"); break;
            case 3: System.out.println("maertie"); break;
            case 4: System.out.println("aprilie"); break;
            case 5: System.out.println("mai"); break;
            case 6: System.out.println("iunie"); break;
            case 7: System.out.println("iulie"); break;
            case 8: System.out.println("august"); break;
            case 9: System.out.println("septembrie"); break;
            default:
                System.out.println("luna nu este valida");
        }




    }
}
