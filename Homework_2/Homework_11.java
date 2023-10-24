import java.util.Scanner;

public class Homework_11{
    public static void main(String[] args) throws Exception 
    {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Height =");
        int height = scanner.nextInt();
        System.out.println("Width =");
        int width = scanner.nextInt();
        
        int yer = 0;
        int yon = 1;
        
        
        for (int i = 0; i < height; i++)
        {
        
            
            //satırları doldulmak için
            System.out.print("|");
                for(int j=0 ; j < width ; j++ )
                {
                    if (j==yer)
                    {
                        System.out.print("*");
                        Thread.sleep(1000);
                    }
                    
                    if (j!=yer){
                        System.out.print(" ");
                        Thread.sleep(250);
                    }

                }
            //köşe ve alt satır
            System.out.println("|");


            // uçlara gelirse yön değiştirmesi için
            if(yon==1)
                yer=yer+1;
            else
                yer=yer-1;
            
            if(yer==width-1)
                yon=0;
            if(yer==0)
                yon=1;
        }




    scanner.close();
    }
}