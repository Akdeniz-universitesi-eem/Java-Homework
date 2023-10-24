import java.util.Scanner;

public class Homework_9
{
    public static void displayDuration(long sanıye) {
        long saat;
        long dakıka;
        long second;
        saat = sanıye / 3600;
        dakıka = (sanıye / 60 ) % 60;
        second = sanıye % 60;
        
        if(saat != 0)
            System.out.print(saat +" saat  ");
        if(dakıka !=0)
            System.out.print(dakıka +" dakika  ");
        if(second != 0)
            System.out.print(second +" saniye");
    }
      
    
    public static void main(String[] args) throws Exception 
    {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Süre giriniz");
        long numara = scanner.nextLong();
        displayDuration(numara);
        Thread.sleep(10000);


        scanner.close();
    }
}