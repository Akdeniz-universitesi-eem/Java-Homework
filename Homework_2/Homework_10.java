import java.util.Scanner;

public class Homework_10{


    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Parçalancak sayı :");
       int Psayı = scanner.nextInt();

       //sayıya kadar sırayla artsın ve moduna bakalım mod sıfırsa yazdırsın .
       
        for(int i=2;i<=Psayı;i++)
        {
            while(Psayı % i == 0)
            {   
                Psayı = Psayı/i;
                System.out.println(i);
            }

        }

        scanner.close();
    }
}