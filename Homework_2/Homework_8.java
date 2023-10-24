import java.util.Scanner;

public class Homework_8{
   public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Şekil için sayı ?");
        int kenar = scanner.nextInt();
        for(int i = 0;i<kenar;i++)
        {
            //ortalamak için büyük sayılar terminale sığmıyor
            System.out.print("              ");
            //üst kısım
            for( int j=i;j<kenar-1;j++)
            {
                System.out.print(" ");
            }
            for(int a = 0;a<(1+2*i);a++)
            {
                System.out.print("*");
            }
            Thread.sleep(500);
            System.out.println("");
        }
        
        for (int i = kenar-1; i > -1; i--) 
        {
            System.out.print("              ");
                //alt kısım üstün reverslenmiş hali
                for (int j=i;j<kenar;j++) 
                {
                    System.out.print(" ");
                }
                for (int a = 0;a<(1+2*(i-1));a++) 
                {
                    System.out.print("*");
                }
            Thread.sleep(500);
            System.out.println("");
        }

        scanner.close();
    }


}