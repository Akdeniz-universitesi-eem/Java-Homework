import java.util.Scanner;

public class Homework_12
{

    public static boolean Asalbul(int a)
    {
        int Asay=0;
        for(int i=2;i<(a+1);i++)
        {
            if(a%i==0)
                Asay=Asay+1;

        }
        if(Asay == 1){
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) throws Exception 
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yazılacak sayı ?");
        int say = scanner.nextInt();

        //Sırayla asalları bulup toplamayı deneme
        for(int i=2;i<say;i++)
            //eğer i asalsa
            if(Asalbul(i))
                for(int j= 2;j<say;j++)
                {
                    //eğer j de asalsa
                    if(Asalbul(j))
                        if(i+j==say)
                        {
                            System.out.println(i +"+"+ j + "=" + say);
                            Thread.sleep(1000);
                        }

                }

                
        
    







        scanner.close();
    }
}