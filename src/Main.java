import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny= scan.nextBoolean();
        if (isSunny){
            System.out.println("It is a sunny day, I should go somewhere");
        }else {
            System.out.println("I stay home and practice Java");
        }

    }
}