public class Main{
    public static void main(String[] args){
        /*if(args.length != 1){
            System.err.println("Hiba! Pontosan egy darab parancssori argumentumot adjon meg.");
            System.exit(1);
        }
        int szam = Integer.parseInt(args[0]);

        int result = 0;
        if(szam >= result){
            
        }
        System.out.println("Legnagyobb Fibonacci-szam, amely nem nagyobb mint " + szam + ":" + result);
        */
        Fibonacci();
    }

    private static void Fibonacci(){
        int elozoElotti = 0;
        int elozo = 1;

        System.out.print(elozoElotti + " " + elozo);
        for(int n = 2; n <= 10; n++){
            int aktualis = elozoElotti + elozo;
            elozoElotti = elozo;
            elozo = aktualis;
        }

    }
}