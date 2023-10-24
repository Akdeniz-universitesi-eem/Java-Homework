import java.util.Scanner;

public class Homework_7{

         // işaret şeysi basitleştirmedim böyle kalsın
         public static int signum(int a)
         {
             int ısaret;
             if(a!=0)
                 if(a>0)
                     ısaret = 1;
                 else
                     ısaret = -1;
             else
                 ısaret = 0;
             return ısaret;
         }
     public static void main(String[] args) throws Exception 
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("İsareti test etmek için sayı:");
        int ısaretsay = scanner.nextInt();
        System.out.println(signum(ısaretsay));


        scanner.close();
    }


}