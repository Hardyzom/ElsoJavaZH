import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kerem adjon meg egy sztringet: ");
        String s = sc.nextLine();
        System.out.print("Adja meg hany karakterrel szeretne jobbra rotalni a sztringet: ");
        String szam = sc.nextLine();
        sc.close();

        String output = StringUtils.rotateStringRight(s);
        System.out.println("Eredmeny: " + s);






    }
}